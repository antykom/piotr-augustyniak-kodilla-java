package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuAlgorithm {
    private final List<Integer> usedValue = new ArrayList<>();
    private ArrayList<BacktrackElement> backtrack = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void solveSudoku(SudokuBoard board) {
        SudokuBoard tmpBoard;
        String coordinate;

        do {
            tmpBoard = deepCopyBoard(board);
            rowIteration(board);
            colIteration(board);
            sectionIteration(board);

            if (changeOfTableContent(board, tmpBoard)) {
                System.out.println(board.toString());
                System.out.println("Guess the next number");
                boolean correctValue;
                do {
                    coordinate = sc.nextLine();
                    correctValue = addElementToBoard(Character.getNumericValue(coordinate.charAt(0)), Character.getNumericValue(coordinate.charAt(2)),
                            Character.getNumericValue(coordinate.charAt(4)), board);
                    backtrack.add(new BacktrackElement(deepCopyBoard(board).getBoard(), coordinate.substring(0, 4), Character.getNumericValue(coordinate.charAt(4))));
                } while (!correctValue);
            }
            tmpBoard.getBoard().clear();
        } while (!checkIfSolved(board));
    }

    private void rowIteration(SudokuBoard board) {
        for (int i = 0; i < 9; i++) {
            for (SudokuElement element : board.getBoard().get(i).row) {
                if (element.getValue() != SudokuElement.EMPTY) {
                    usedValue.add(element.getValue());
                }
            }

            for (SudokuElement element : board.getBoard().get(i).row) {
                if (element.getValue() == SudokuElement.EMPTY) {
                    for (Integer uV : usedValue) {
                        element.possibleValue.remove(uV);
                    }
                    if (element.possibleValue.size() == 1) {
                        element.setValue(element.possibleValue.get(0));
                        element.possibleValue.clear();
                    }
                }
            }
            usedValue.clear();
        }
    }

    private void colIteration(SudokuBoard board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                SudokuElement element = board.getBoard().get(j).row.get(i);
                if (element.getValue() != SudokuElement.EMPTY) {
                    usedValue.add(element.getValue());
                }
            }

            for (int j = 0; j < 9; j++) {
                SudokuElement element = board.getBoard().get(j).row.get(i);
                if (element.getValue() == SudokuElement.EMPTY) {
                    for (Integer uV : usedValue) {
                        element.possibleValue.remove(uV);
                    }
                    if (element.possibleValue.size() == 1) {
                        element.setValue(element.possibleValue.get(0));
                        element.possibleValue.clear();
                    }
                }
            }
            usedValue.clear();
        }
    }

    private void sectionIteration(SudokuBoard board) {
        sectionSelect(0, 3, 0, 3, board);
        sectionSelect(3, 6, 0, 3, board);
        sectionSelect(6, 9, 0, 3, board);
        sectionSelect(0, 3, 3, 6, board);
        sectionSelect(3, 6, 3, 6, board);
        sectionSelect(6, 9, 3, 6, board);
        sectionSelect(0, 3, 6, 9, board);
        sectionSelect(3, 6, 6, 9, board);
        sectionSelect(6, 9, 6, 9, board);
    }

    private void sectionSelect(int fromRow, int toRow, int fromCol, int toCol, SudokuBoard board) {
        for (int i = fromCol; i < toCol; i++) {
            for (int j = fromRow; j < toRow; j++) {
                SudokuElement element = board.getBoard().get(j).row.get(i);
                if (element.getValue() != SudokuElement.EMPTY) {
                    usedValue.add(element.getValue());
                }
            }
        }
        for (int i = fromCol; i < toCol; i++) {
            for (int j = fromRow; j < toRow; j++) {
                SudokuElement element = board.getBoard().get(j).row.get(i);
                if (element.getValue() == SudokuElement.EMPTY) {
                    for (Integer uV : usedValue) {
                        element.possibleValue.remove(uV);
                    }
                    if (element.possibleValue.size() == 1) {
                        element.setValue(element.possibleValue.get(0));
                        element.possibleValue.clear();
                    }
                }
            }
            usedValue.clear();
        }
    }

    private SudokuBoard deepCopyBoard(SudokuBoard board) {
        SudokuBoard boardToFill = new SudokuBoard();
        for (int i = 0; i < 9; i++) {       //row
            for (int j = 0; j < 9; j++) {
                boardToFill.getBoard().get(i).row.get(j).setValue(
                        board.getBoard().get(i).row.get(j).getValue());
            }
        }
        return boardToFill;
    }

    private boolean changeOfTableContent(SudokuBoard board, SudokuBoard board2) {
        boolean equalsBoards = true;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!(board.getBoard().get(i).row.get(j).getValue() == board2.getBoard().get(i).row.get(j).getValue())) {
                    equalsBoards = false;
                    break;
                }
            }
        }

        return equalsBoards;
    }

    private boolean addElementToBoard(int x, int y, int value, SudokuBoard board) {
        boolean correctValue = true;
        if (!((x < 1 || x > 9) || (y < 1 || y > 9) || ((value < 1 || value > 9))) && board.getBoard().get(y - 1).row.get(x - 1).possibleValue.contains(value)) {
            if (board.getBoard().get(y - 1).row.get(x - 1).getValue() == SudokuElement.EMPTY) {
                board.getBoard().get(y - 1).row.get(x - 1).setValue(value);
                board.getBoard().get(y - 1).row.get(x - 1).possibleValue.remove(Integer.valueOf(value));
            } else {
                System.out.println("The field is already taken");
                correctValue = false;
            }
        } else {
            System.out.println("Wrong coordinates or value");
            correctValue = false;
        }
        return correctValue;
    }

    private boolean checkIfSolved(SudokuBoard board) {
        boolean solved = true;
        for (SudokuRow row : board.getBoard()) {
            for (SudokuElement element : row.row) {
                if (element.getValue() == -1) {
                    solved = false;
                    break;
                }

            }
        }
        return solved;
    }
}
