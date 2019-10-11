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

        Assert.assertEquals(checkNumbersEmpty, (oddNumbersExterminator.exterminate(checkNumbersEmpty)));
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbersGenerator = new ArrayList<>();
        ArrayList<Integer> checkEvenNumbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbersGenerator.add(i);
            if (numbersGenerator.get(i) % 2 == 0) {
                checkEvenNumbers.add(numbersGenerator.get(i));
            }
        }
        Assert.assertEquals(checkEvenNumbers, (oddNumbersExterminator.exterminate(checkEvenNumbers)));
    }
}
