package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> board = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            board.add(new SudokuRow());
        }
    }

    @Override
    public String toString() {
        String boardToPrint = "";

        for (SudokuRow row : board) {
            for (SudokuElement element : row.row) {
                if (element.getValue() == SudokuElement.EMPTY) {
                    boardToPrint = boardToPrint.concat(" ");
                } else {
                    boardToPrint = boardToPrint.concat(element.toString());
                }

                if (row.row.indexOf(element) == row.row.size() - 1) {
                    if (board.indexOf(row) != board.size() - 1) {
                        boardToPrint = boardToPrint.concat("\n---------------------------------\n");
                    }
                } else {
                    boardToPrint = boardToPrint.concat(" | ");
                }
            }
        }
        return boardToPrint;
    }

    public List<SudokuRow> getBoard() {
        return board;
    }
}
