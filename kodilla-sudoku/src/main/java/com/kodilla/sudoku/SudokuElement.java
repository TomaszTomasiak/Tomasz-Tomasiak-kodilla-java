package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private Integer value;
    public static int EMPTY = -1;
    public List<Integer> possibleValues;

    public SudokuElement(int value) {
        this.value = value;

        possibleValues = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            possibleValues.add(i+1);
        }
    }

    public SudokuElement() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

