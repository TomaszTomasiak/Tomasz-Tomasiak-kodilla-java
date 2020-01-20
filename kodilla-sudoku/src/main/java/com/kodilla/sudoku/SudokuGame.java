package com.kodilla.sudoku;

public class SudokuGame {
    public static void main(String[] args) {

        boolean gameFinished = false;

        while(!gameFinished) {
            SudokuController theGame = new SudokuController();
            gameFinished = theGame.resolveSudoku();

        }

    }
}
