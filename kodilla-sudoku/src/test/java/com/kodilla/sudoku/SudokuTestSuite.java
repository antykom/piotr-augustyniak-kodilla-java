package com.kodilla.sudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SudokuTestSuite {

    @Test
    void buildBoardTest() {
        //Given
        SudokuBoard board = new SudokuBoard();
        //When & Then
        System.out.println(board.toString());
    }

    @Test
    void addElementTest() {
        //Given
        SudokuBoard board = new SudokuBoard();
        SudokuGame game = new SudokuGame();
        //When
        game.addElementToBoard(1, 1, 1);
        int result = game.board.getBoard().get(0).row.get(0).possibleValue.size();
        //Then
        assertEquals(8, result);

    }

    @Test
    void algorithmTest() {
        //Given
        SudokuBoard board = new SudokuBoard();
        SudokuGame game = new SudokuGame();
        SudokuAlgorithm algorithm = new SudokuAlgorithm();

        //When
        game.addElementToBoard(2, 1, 1);
        game.addElementToBoard(1, 2, 3);
        game.addElementToBoard(1, 6, 4);
        game.addElementToBoard(1, 9, 7);
        game.addElementToBoard(2, 2, 5);
        game.addElementToBoard(2, 4, 8);
        game.addElementToBoard(2, 7, 4);
        game.addElementToBoard(3, 2, 6);
        game.addElementToBoard(3, 4, 3);
        game.addElementToBoard(3, 6, 5);
        game.addElementToBoard(3, 7, 2);
        game.addElementToBoard(3, 9, 9);
        game.addElementToBoard(4, 1, 6);
        game.addElementToBoard(4, 4, 2);
        game.addElementToBoard(4, 7, 5);
        game.addElementToBoard(4, 9, 4);
        game.addElementToBoard(5, 3, 5);
        game.addElementToBoard(5, 4, 6);
        game.addElementToBoard(5, 6, 7);
        game.addElementToBoard(5, 7, 3);
        game.addElementToBoard(6, 1, 4);
        game.addElementToBoard(6, 3, 3);
        game.addElementToBoard(6, 6, 8);
        game.addElementToBoard(6, 9, 2);
        game.addElementToBoard(7, 1, 3);
        game.addElementToBoard(7, 3, 6);
        game.addElementToBoard(7, 4, 4);
        game.addElementToBoard(7, 6, 2);
        game.addElementToBoard(7, 8, 7);
        game.addElementToBoard(8, 3, 9);
        game.addElementToBoard(8, 6, 6);
        game.addElementToBoard(8, 8, 2);
        game.addElementToBoard(8, 9, 8);
        game.addElementToBoard(9, 1, 7);
        game.addElementToBoard(9, 4, 9);
        game.addElementToBoard(9, 8, 4);

        //Then
        game.resolveSudoku();

    }

    @Test
    void algorithmTest2() {
        //Given
        SudokuBoard board = new SudokuBoard();
        SudokuGame game = new SudokuGame();
        SudokuAlgorithm algorithm = new SudokuAlgorithm();

        //When
        game.addElementToBoard(1, 1, 7);
        game.addElementToBoard(1, 9, 4);
        game.addElementToBoard(2, 4, 2);
        game.addElementToBoard(2, 6, 8);
        game.addElementToBoard(3, 3, 5);
        game.addElementToBoard(3, 4, 6);
        game.addElementToBoard(3, 6, 4);
        game.addElementToBoard(3, 7, 3);
        game.addElementToBoard(4, 2, 1);
        game.addElementToBoard(4, 8, 3);
        game.addElementToBoard(5, 1, 3);
        game.addElementToBoard(5, 2, 7);
        game.addElementToBoard(5, 8, 5);
        game.addElementToBoard(5, 9, 1);
        game.addElementToBoard(6, 2, 8);
        game.addElementToBoard(6, 8, 9);
        game.addElementToBoard(7, 3, 2);
        game.addElementToBoard(7, 4, 4);
        game.addElementToBoard(7, 6, 7);
        game.addElementToBoard(7, 7, 6);
        game.addElementToBoard(8, 4, 9);
        game.addElementToBoard(8, 6, 2);
        game.addElementToBoard(9, 1, 1);
        game.addElementToBoard(9, 9, 9);

        //Then
        game.resolveSudoku();

    }
}
