package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class Country {

    private final String countryName;
    private final int numberOfPeople;


    public Country(String countryName, int numberOfPeople) {
        this.countryName = countryName;
        this.numberOfPeople = numberOfPeople;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }


    public  BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal(getNumberOfPeople());
        return peopleQuantity;
    }
}
