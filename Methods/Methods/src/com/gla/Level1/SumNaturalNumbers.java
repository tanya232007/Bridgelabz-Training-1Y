package com.gla.Level1;
//Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers
//using loop

public class SumNaturalNumbers {


        public static void findSum(int n) {
            int sum = 0;


            for (int i = 1; i <= n; i++)
            {
                sum = sum + i;
            }


            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }

        public static void main(String[] args)
        {
            if (args.length > 0)
            {
                int n = Integer.parseInt(args[0]);
                findSum(n);
            }
            else
            {
                System.out.println("Please provide a number as input.");
            }
        }
}







