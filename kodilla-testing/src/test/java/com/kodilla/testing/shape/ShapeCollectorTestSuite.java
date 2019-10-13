package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(Shape shape) {
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> getExpected = new ArrayList<>();
        Square square = new Square("square", 10.7);

        shapeCollector.addFigure(square);
        Shape retrivedShape;
        retrivedShape = shapeCollector.getFigure(0);

        Assert.assertEquals(square, retrivedShape);
    }

    @Test
    public void testRemoveFigure(Shape shape) {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square", 10.7);

        shapeCollector.addFigure(square);
        boolean result = shapeCollector.removeFigure(square);

        Assert.assertTrue(result);
    }


    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList <String> expected = new ArrayList<>();
        Square square = new Square("square", 10.7);

        expected.add("square");
        String showCheck = shapeCollector.showFigures();

        Assert.assertEquals(expected, showCheck);

    }
}
