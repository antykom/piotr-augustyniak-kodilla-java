package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception{
        SecondChallenge sc = new SecondChallenge();

        try {
            String str = sc.probablyIWillThrowException(2, 2);
        } catch (Exception e){
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Always here ;)");
        }
    }
}
