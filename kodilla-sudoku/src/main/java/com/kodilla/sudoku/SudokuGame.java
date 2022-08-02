package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    SudokuBoard board = new SudokuBoard();
    SudokuAlgorithm algorithm = new SudokuAlgorithm();

    public boolean resolveSudoku() {
        String coordinate;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println(board.toString());
            coordinate = sc.next();
            addElementToBoard(Character.getNumericValue(coordinate.charAt(0)), Character.getNumericValue(coordinate.charAt(2)),
                    Character.getNumericValue(coordinate.charAt(4)));
        } while (!coordinate.equals("SUDOKU"));

        algorithm.solveSudoku(board);
        System.out.println(board.toString());

        return true;
    }

    public void addElementToBoard(int x, int y, int value) {
        if (!((x < 1 || x > 9) || (y < 1 || y > 9) || ((value < 1 || value > 9))) && board.getBoard().get(y - 1).row.get(x - 1).possibleValue.contains(value)) {
            if (board.getBoard().get(y - 1).row.get(x - 1).getValue() == SudokuElement.EMPTY) {
                board.getBoard().get(y - 1).row.get(x - 1).setValue(value);
                board.getBoard().get(y - 1).row.get(x - 1).possibleValue.remove(Integer.valueOf(value));

            } else {
                System.out.println("The field is already taken");
            }
        } else {
            System.out.println("Wrong coordinates or value");
        }
    }

}
