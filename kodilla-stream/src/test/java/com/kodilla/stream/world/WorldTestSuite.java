package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country("Poland", 38000000));
        countries.add(new Country("France", 68000000));
        countries.add(new Country("Germany", 73000000));
        countries.add(new Country("China", 723000000));
        countries.add(new Country("Russia", 234000000));
        countries.add(new Country("Japan", 56000000));
        countries.add(new Country("New Zeland", 15600000));
        countries.add(new Country("Australia", 23000000));

        ArrayList<Continent> continentsList =new ArrayList<>();
        continentsList.add(new Continent ("europe"));
        continentsList.add(new Continent ("Asia"));
        continentsList.add(new Continent ("Australia"));



//When
        //BigDecimal totalPeopleQuantity = continentsList.stream()

                //.flatMap(continent -> continent.continentsList.stream())
                //.map(Country::getPeopleQuantity)
                //.reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedNuberOfPeople = new BigDecimal("7737600000");
        //Assert.assertEquals(expectedNuberOfPeople, totalPeopleQuantity);
    }
}
