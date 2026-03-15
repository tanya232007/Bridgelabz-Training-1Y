package com.gla.Level1;
//Write a program to take 2 numbers and print their quotient and reminder
//Hint =>
//a. Take user input as integer
//b. Use division operator (/) for quotient and moduli operator (%) for reminder
//c. Write Method to find the reminder and the quotient of a number
//public static int[] findRemainderAndQuotient(int number, int divisor)



public class QuotientRemainder {



        public static int[] findRemainderAndQuotient(int number, int divisor)
        {
            int quotient = number / divisor;
            int remainder = number % divisor;


            int[] result = {quotient, remainder};
            return result;
        }

        public static void main(String[] args)
        {

            if (args.length >= 2)
            {
                int number = Integer.parseInt(args[0]);
                int divisor = Integer.parseInt(args[1]);

                int[] result = findRemainderAndQuotient(number, divisor);

                System.out.println("Quotient: " + result[0]);
                System.out.println("Remainder: " + result[1]);
            } else {
                System.out.println("Please provide two numbers as input.");
            }
        }
    }


