package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator(10, 31);

        int addResult = calc.add();
        int subtractResult = calc.subtract();

        if(addResult == 41 && subtractResult == -21){
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
