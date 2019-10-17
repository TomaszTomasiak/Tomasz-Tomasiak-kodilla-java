package com.kodilla.stream;

import com.kodilla.stream.beautifier.DecoratingStyles;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        System.out.println("\nZadanie 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Welcome to stream", text -> text.toUpperCase());
        poemBeautifier.beautify(" - are the first 3 letters of alphabet and the last 3 are - ", text -> "ABC"+ text + "XYZ");
        poemBeautifier.beautify("password", DecoratingStyles::hiddenLettersOfText);
        poemBeautifier.beautify("MISSISSIPPI", DecoratingStyles::letterSpacing);

    }
}
