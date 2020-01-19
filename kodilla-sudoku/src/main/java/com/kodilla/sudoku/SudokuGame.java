package com.kodilla.sudoku;

public class SudokuGame {
    public static void main(String[] args) {

        boolean gameFinished = false;

        while(!gameFinished) {
            SudokuController theGame = new SudokuController();
            gameFinished = theGame.resolveSudoku();

        }

/*
        SudokuBoard sudokuBoard = new SudokuBoard();

        System.out.println(sudokuBoard);
        System.out.println(SudokuController.menu());

        //testy

        System.out.println(sudokuBoard);
        SudokuController sudokuController = new SudokuController();
        System.out.println(sudokuController.menu());

 */

    }
}
