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
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> getExpected = new ArrayList<>();
        Square square = new Square("square", 10.7);

        //When
        shapeCollector.addFigure(square);
        Shape retrivedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square, retrivedShape);
    }

    @Test
    public void testRemoveFigure(Shape shape) {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square", 10.7);
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testShowFigures(Shape shape) {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList <String> namesList = new ArrayList<>();
        namesList.add("square");
        String expected = namesList.get(0);

        //When
        String showCheck = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(expected, showCheck);
    }
}
