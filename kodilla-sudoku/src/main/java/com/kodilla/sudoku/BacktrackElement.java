package com.kodilla.sudoku;

import java.util.List;

public class BacktrackElement {
    private List<SudokuRow> backTrackBoard;
    private String coordinate;
    private int guessValue;

    public BacktrackElement(List<SudokuRow> backTrackBoard, String coordinate, int guessValue) {
        this.backTrackBoard = backTrackBoard;
        this.coordinate = coordinate;
        this.guessValue = guessValue;
    }


}
