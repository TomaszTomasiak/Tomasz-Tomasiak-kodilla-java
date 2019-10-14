package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();
    private String shapeName;
    private double field;

    public ShapeCollector() {
    }

    public ArrayList<Shape> getShape() {
        return figures;
    }

    public Shape addFigure(Shape shape) {
        //Shape theShape;
        //theShape = new Shape(shapeName, field);
        // figures.add(theShape);
        return shape;
    }

    public boolean removeFigure(Shape shape) {

        return true;
    }

    public Shape getFigure(int n) {
        Shape figure = figures.get(n);
        return figure;
    }

    public String showFigures() {


        String show;
       // show = figures;
        return "";
    }
}
