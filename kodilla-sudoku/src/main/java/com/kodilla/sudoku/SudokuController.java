package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuController {
    private static Scanner sc = new Scanner(System.in);
    private SudokuBoard board;

    public void solveSudoku() { // back to this ????

        if (!backtrackSolve()) {
            System.out.println("This sudoku can't be solved"); // to develop

            //startNewGame();

        }
    }

    public boolean isPossibleToPutHere(int r, int c, Integer value) {


        // row check - searching element with value from iteration in line 86
        for (int j = 0; j < 9; j++) {
            if (board.boardOfElements[r][j].getValue() == value) {
                board.boardOfElements[r][c].possibleValues.remove(value);
                return false;
            }
        }

        // column check - searching element with value from iteration in line 86
        for (int i = 0; i < 9; i++) {
            if (board.boardOfElements[i][c].getValue() == value) {
                board.boardOfElements[r][c].possibleValues.remove(value);
                return false;
            }
        }

        // box check - searching element with value from iteration in line 86
        int boxRow = r - r % 3;
        int boxColumn = c - c % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (board.boardOfElements[boxRow + i][boxColumn + j].getValue() == value) {
                    board.boardOfElements[r][c].possibleValues.remove(value);
                    return false;
                }
            }
        }
        return true;
    }

    public boolean backtrackSolve() {
        int columnIndex = 0;
        int rowIndex = 0;
        boolean isEmptyField = false;

        for (int i = 0; i < 9 && !isEmptyField; i++) {

            for (int j = 0; j < 9 && !isEmptyField; j++) {

                if (board.boardOfElements[i][j].getValue() == SudokuElement.EMPTY) {

                    rowIndex = i;
                    columnIndex = j;
                    isEmptyField = true;
                }
            }
        }

        if (!isEmptyField) {
            return true;
        }


        int sizeOfPossibleValuesList = board.boardOfElements[rowIndex][columnIndex].possibleValues.size();

        for (int index = 0; index < sizeOfPossibleValuesList; index++) {

            Integer possibleValue = board.boardOfElements[rowIndex][columnIndex].possibleValues.get(index);

            if (isPossibleToPutHere(rowIndex, columnIndex, possibleValue)) {

                board.boardOfElements[rowIndex][columnIndex].setValue(possibleValue);

                if (backtrackSolve()) {
                    return true;
                }

                board.boardOfElements[rowIndex][columnIndex].setValue(SudokuElement.EMPTY);
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
                return startNewGame(); // back to this
            case "x":
                return exitGame();
            default:
                if (isDigits && digitsCorrectLength) {

                    char setColumn = input.charAt(1);
                    char setRow = input.charAt(0);
                    char setValue = input.charAt(2);
                    int column = setColumn - 48;
                    int row = setRow - 48;
                    int value = setValue - 48;

                    return new UserChoice(column, row, value);

                } else {
                    return new UserChoice(UserChoiceType.NONE);
                }
        }
    }

    public UserChoice startNewGame() {
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.println("Do you want to start a new game? y/n");
            String input = sc.nextLine();
            sc.nextLine();
            if (input.equals("y")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.NEW_GAME);
            }
            if (input.equals("n")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.NONE);
            }
        }
        return new UserChoice(UserChoiceType.NONE);
    }

    private static UserChoice exitGame() {
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.println("Do you want exit? Y/N"); // why print double?
            String input = sc.nextLine().toUpperCase();
            sc.nextLine();
            if (input.equals("Y")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.EXIT);
            } else if (input.equals("N")) {
                isCorrect = true;
                return new UserChoice(UserChoiceType.NONE);
            }
        }
        return new UserChoice(UserChoiceType.NONE);
    }

    public boolean resolveSudoku() {

        boolean finishGame = false;
        board = new SudokuBoard();
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

    public void setValueToSudokuElement(int column, int row, int value) {
        if (!canSetValue(column, row, value)) {
            System.out.println("Incorrect value " + value + " in row " + row + " column " + column);
        }
        board.boardOfElements[column][row].setValue(value);
    }

    private void setValue(UserChoice choice) {
        int column = choice.getColumn() - 1;
        int row = choice.getRow() - 1;
        int value = choice.getValue();

        try {
            setValueToSudokuElement(column, row, value);

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

    private boolean canSetValue(int column, int row, int value) {
        boolean correctValue = value >= 1 && value <= 9;
        return correctValue && correctColumnAndRow(column, row);
    }

    private boolean correctColumnAndRow(int column, int row) {
        boolean correctColumn = column >= 1 && column <= 9;
        boolean correctRow = row >= 1 && row <= 9;
        return correctColumn && correctRow;
    }

}
