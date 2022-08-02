package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public List<SudokuElement> row = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i<9; i++){
            row.add(new SudokuElement());
        }
    }

}
