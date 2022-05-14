package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 31);

        int addResult = calc.add();
        int subtractResult = calc.subtract();

        if(addResult == 41){
            System.out.println("Test ADD ok!!");
        } else {
            System.out.println("Test ADD fail!!");
        }

        if(subtractResult == -21){
            System.out.println("Test SUBTRACT ok!!");
        } else {
            System.out.println("Test SUBTRACT fail!!");
        }
    }
}
