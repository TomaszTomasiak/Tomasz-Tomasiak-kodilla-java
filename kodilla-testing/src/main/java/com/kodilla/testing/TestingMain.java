package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.kalkulator.Kalkulator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println(" - - - - - -  - - - -  - - - - - - -");

        Kalkulator kalkulator = new Kalkulator(81, 9);

        int addAToBResult = kalkulator.addAToB();
        int subtructBFromAResult = kalkulator.subtractBFromA();

        if (addAToBResult == kalkulator.getA() + kalkulator.getB() && subtructBFromAResult == kalkulator.getA() - kalkulator.getB()) {
            System.out.println("Test - pierwszy test jednostkowy: test OK");
        } else {
            System.out.println("Test - pierwszy test jednostkowy: Error!");
        }
    }
}