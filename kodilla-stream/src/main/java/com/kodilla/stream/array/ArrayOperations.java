package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        List<Integer> theNumbersList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
          theNumbersList.add(numbers[i]);
       }

       //IntStream.range(0, numbers.length)
        //       .map(n->(numbers[n]));




        OptionalDouble tmpAverage = IntStream.range(0, theNumbersList.size())
                .map(n -> theNumbersList.get(n))
                .average();

        double average = tmpAverage.getAsDouble();

        return average;
    }
}
