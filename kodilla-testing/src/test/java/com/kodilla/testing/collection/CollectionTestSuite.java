package com.kodilla.testing.collection;

import com.kodilla.testing.collection.CollectionTestSuite;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> checkNumbersEmpty = oddNumbersExterminator.exterminate(emptyList);

        Assert.assertEquals(checkNumbersEmpty, emptyList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> checkNumbers = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        checkNumbers.add(2);
        checkNumbers.add(3);
        checkNumbers.add(4);
        checkNumbers.add(5);

        expected.add(2);
        expected.add(4);


        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(checkNumbers);
        Assert.assertEquals(evenNumbers, expected);
    }
}
