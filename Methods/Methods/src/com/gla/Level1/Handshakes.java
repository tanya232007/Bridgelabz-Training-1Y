package com.gla.Level1;
//Create a program to find the maximum number of handshakes among students.
//Hint =>
//a. Get integer input for the numberOfStudents variable.
//b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of
//possible handshakes.
//c. Write a method to use the combination formulae to calculate the number of handshakes
//d. Display the number of possible handshakes.


public class Handshakes {
    public static void calculateHandshakes(int  numberOfStudents ){
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Maximum number of possible handshakes: " + handshakes);
    }

    public static void main(String[] args) {

        int numberOfStudents = 5;

        System.out.println("Number of students: " + numberOfStudents);


        calculateHandshakes(numberOfStudents);
    }
}






