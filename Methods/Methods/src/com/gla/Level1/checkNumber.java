package com.gla.Level1;

//Write a program to check whether a number is positive, negative, or zero.
//        Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1
//        for positive number and 0 if number is zero

public class checkNumber {



        public static void checkNumber(int num) {
            if (num > 0)
            {
                System.out.println("The number is Positive.");
            }
            else if (num < 0)
            {
                System.out.println("The number is Negative.");
            }
            else
            {
                System.out.println("The number is Zero.");
            }
        }

        public static void main(String[] args)
        {
            if (args.length > 0)
            {
                int number = Integer.parseInt(args[0]);
                checkNumber(number);
            }
            else
            {
                System.out.println("Please provide a number as input.");
            }
        }
    }



