package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    SudokuController sudokuController = new SudokuController();

    public SudokuRow[] boardRows = new SudokuRow[9];

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            boardRows[i] = new SudokuRow();

        }
    }


    @Override
    public String toString() {
        StringBuilder printBoard = new StringBuilder("    1   2   3   4   5   6   7   8   9" + "\n");

        for (int i = 0; i < 9; i++) {
            printBoard.append(1 + i).append(" |");
            for (int n = 0; n < 9; n++) {
                if (boardRows[i].rowSudokuElements.get(n).getValue() == SudokuElement.EMPTY) {
                    printBoard.append("   ");
                } else {
                    printBoard.append(" ");
                    printBoard.append(boardRows[i].rowSudokuElements.get(n).getValue());
                    printBoard.append(" ");
                }
                printBoard.append("|");
            }
            printBoard.append("\n");
        }
        return printBoard.toString();
    }
}
