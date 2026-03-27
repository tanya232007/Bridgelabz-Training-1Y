package com.ExceptionHandling;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }


    public class CustomExceptionHandling {
        static void ageCheck(int a) throws InvalidAgeException {
            if (a < 18) {


                throw new InvalidAgeException("Invalid age");
            }


        }

    }


    public static void main(String[] args) {
        try {
            CustomExceptionHandling.ageCheck( 10);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}







