package com.kodilla.testing.shape;

import org.junit.*;

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

        ShapeCollector shapeCollector = new ShapeCollector("triangle", 10.25 );

    }

    @Test
    public void testRemoveFigure(Shape shape) {

    }

    @Test
    public void testGetFigure(int n) {

    }

    @Test
    public void testShowFigures() {

    }
}
