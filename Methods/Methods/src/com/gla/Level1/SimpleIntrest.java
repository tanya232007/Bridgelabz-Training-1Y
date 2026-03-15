package com.gla.Level1;
//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
//        Hint =>
//a. Simple Interest = Principal * Rate * Time / 100
//b. Take user input for principal, rate, time
//c. Write a method to calculate the simple interest given principle, rate and time as
//        parameters
//d. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

public class SimpleIntrest {

    public static void calculateSI(double principal, double rate, double time) {
        double si = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + si );

    }

    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 2;

        calculateSI(principal, rate, time);


    }

}





