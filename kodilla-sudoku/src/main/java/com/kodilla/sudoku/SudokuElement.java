package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {
    private int value;
    public List<Integer> possibleValue = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    public static int EMPTY = -1;

    public SudokuElement() {
        this.value = EMPTY;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
