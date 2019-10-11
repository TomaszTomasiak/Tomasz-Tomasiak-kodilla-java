package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    String shapeName;
    double field;
    ArrayList<String> shapesList = new ArrayList<>();

    public ShapeCollector(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }

    public void addFigure(Shape shape) {

    }
    public void removeFigure(Shape shape) {

    }
    public void getFigure(int n) {

    }
    public void showFigures() {

    }
}
