package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public ShapeCollector() {

    }

    public ArrayList<Shape> getShape() {
        return figures;
    }

    public Shape addFigure(Shape shape) {

        return shape;
    }
    public boolean removeFigure(Shape shape) {

        return true;
    }
    public Shape getFigure(int n) {
    return null;
    }
    public String showFigures() {
    return null;
    }
}
