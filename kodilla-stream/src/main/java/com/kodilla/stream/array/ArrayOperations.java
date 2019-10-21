package com.kodilla.stream.array;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[]numbers) {
        int[] theNumbers = IntStream.range(0, numbers.length)
                .count()





       IntStream.range(0, numbers.length);



    }
    /*
    double sum = 0;

        Double[] digits = new Double[20];

        for (int i = 0; i < digits.length; i++) {
                Random random = new Random();
                double x = random.nextDouble();
                digits[i] = x;

                System.out.println("Array element digits[" + i + "] = " + digits[i]);
                sum = sum + digits[i];
            }

        double average = sum / digits.length;
     */
}
