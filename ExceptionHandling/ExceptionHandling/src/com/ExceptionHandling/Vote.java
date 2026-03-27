package com.ExceptionHandling;

public class Vote {


    static void ageChecker(int a)
    {
        if(a<18)
        {
            throw new ArithmeticException("Invalid age");
        }
        System.out.println("Valid age");


    }
    public static void main(String[] args) {
        ageChecker(19);


    }
}
