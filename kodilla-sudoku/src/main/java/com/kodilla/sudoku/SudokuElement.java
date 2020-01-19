package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    static int EMPTY = -1;
    List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement(int value) {
        this.value = value;

        for(int i = 1; i <= 9; i++) {
            possibleValues.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

