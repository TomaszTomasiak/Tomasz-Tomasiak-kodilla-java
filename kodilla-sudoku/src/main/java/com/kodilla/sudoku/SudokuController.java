package com.kodilla.sudoku;

import java.util.Random;
import java.util.Scanner;

public class SudokuController {
    private static Scanner sc = new Scanner(System.in);
    private static SudokuBoard board;
    private static SudokuElement[][] sudokuGame = new SudokuElement[9][9];
    private static UserChoice userChoice;

    public static SudokuElement[][] getSudokuGame() {
        return sudokuGame;
    }

    private static void valueOfSudokuElementInitializer() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuGame[i][j].setValue(SudokuElement.EMPTY);
            }
        }
    }

    public void solveSudoku() {

        if (!backtrackSolve()) {
            System.out.println("This sudoku can't be solved. Insert additional value into the board");
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuGame[i][j].setValue(sudokuGame[i][j].getValue()); // -----????????
            }
        }
    }

    public boolean isPossibleToPutHere(int r, int c, int value) {

        // row check
        for (int j = 0; j < 9; j++) {
            if (sudokuGame[r][j].getValue() == value) {
                sudokuGame[r][j].possibleValues.remove(value);
                return false;
            }
        }

        // column check
        for (int i = 0; i < 9; i++) {
            if (sudokuGame[i][c].getValue() == value) {
                sudokuGame[i][c].possibleValues.remove(value);
                return false;
            }
        }

        // box check
        int boxRow = r - r % 3;
        int boxColumn = c - c % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (sudokuGame[boxRow + i][boxColumn + j].getValue() == value) {
                    sudokuGame[boxRow + i][boxColumn + j].possibleValues.remove(value);
                    return false;
                }
            }
        }
        return true;
    }

    public boolean backtrackSolve() {
        int rowIndex = 0, columnIndex = 0;
        boolean isEmpty = false;

        for (int i = 0; i < 9 && !isEmpty; i++) {
            for (int j = 0; j < 9 && !isEmpty; j++) {
                if (sudokuGame[i][j].getValue() == SudokuElement.EMPTY) {
                    isEmpty = true;
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }

        if (!isEmpty) {
            return true;
        }

        for (int v = 0; v < sudokuGame[rowIndex][columnIndex].possibleValues.size(); v++) {
            if (isPossibleToPutHere(rowIndex, columnIndex, v)) {

                sudokuGame[rowIndex][columnIndex].setValue(sudokuGame[rowIndex][columnIndex].possibleValues.get(v));

                if (backtrackSolve()) {
                    return true;
                }

                sudokuGame[rowIndex][columnIndex].setValue(SudokuElement.EMPTY);  // We've failed.
            }
        }

        return false; // Backtracking
    }

    public static String menu() {
        return "SUDOKU\n" +
                "To insert digit into Sudoku board \n" +
                "type 3 digits (example: 123, where: 1 is row index, 2 is column index, 3 is value) \n" +
                "Other options:\n" +
                "sudoku - to solve Sudoku\n" +
                "n - to start a new game\n" +
                "x - to exit the game";
    }

    public UserChoice getUserChoice() {
        System.out.println(menu());
        System.out.println();

        String input = sc.next();

        boolean isDigits = input.chars().allMatch(Character::isDigit);
        boolean digitsCorrectLength = input.length() == 3;

        switch (input.toLowerCase()) {
            case "sudoku":
                return new UserChoice(UserChoiceType.RESOLVE);
            case "n":
                return startNewGame();
            case "x":
                return exitGame();
            default:
                if (isDigits && digitsCorrectLength) {
                    char[] inputTab = input.toCharArray();
                    int column = Character.getNumericValue(inputTab[0]);
                    int row = Character.getNumericValue(inputTab[1]);
                    int value = Character.getNumericValue(inputTab[2]);
                    return new UserChoice(column, row, value);
                } else {
                    return new UserChoice(UserChoiceType.NONE);
                }
        }
    }

    public UserChoice startNewGame() {
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.println("Do you want to start a new game? Y/N");
            String input = sc.nextLine().toUpperCase();
            sc.nextLine();
            if (input.equals("Y")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.NEW_GAME);
            }
            if (input.equals("N")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.NONE);
            }
        }
        return new UserChoice(UserChoiceType.NONE);
    }

    private static UserChoice exitGame() {
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.println("Do you want exit? Y/N");
            String input = sc.nextLine().toUpperCase();
            sc.nextLine();
            if (input.equals("Y")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.EXIT);
            }
            if (input.equals("N")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.NONE);
            }
        }
        return new UserChoice(UserChoiceType.NONE);
    }

    public boolean resolveSudoku() {

        boolean finishGame = false;
        board = new SudokuBoard();
        valueOfSudokuElementInitializer();
        show(board.toString());
        while (!finishGame) {
            UserChoice choice = getUserChoice();
            switch (choice.getChoiceType()) {
                case EXIT:
                    finishGame = true;
                    break;
                case NONE:
                    break;
                case NEW_GAME:
                    board = new SudokuBoard();
                    show(board.toString());
                case SET_VALUE:
                    setValue(choice);
                    show(board.toString());
                    break;
                case RESOLVE:
                    solveSudoku();
                    show(board.toString());
                    startNewGame();
                    break;
            }
        }
        return true;
    }

    private void setValue(UserChoice choice) {
        try {
            sudokuGame[choice.getColumn() - 1][choice.getRow() - 1].setValue(choice.getValue());

        } catch (Exception e) {
            SudokuController.printIncorrectValueToSet(choice);
        }
    }

    public static void printIncorrectValueToSet(UserChoice choice) {
        System.out.println("Incorrect value: " + choice);
    }

    public static void show(String text) {
        System.out.println(text);
    }

}
