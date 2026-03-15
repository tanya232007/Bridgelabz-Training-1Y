package com.gla.Level2;
//Write a program to find the sum of n natural numbers using recursive method and compare
//the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
//        Hint =>
//a. Take the user input number and check whether it's a Natural number
//b. Write a Method to find the sum of n natural numbers using recursion
//c. Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
//d. Compare the two results and print the result

public class SumNaturalNumber{
        public static int recursiveSum(int n) {
            if (n == 1) {
                return 1;
            }
            return n + recursiveSum(n - 1);
        }


        public static int formulaSum(int n) {
            return n * (n + 1) / 2;
        }

        public static void main(String[] args) {

            if (args.length == 0) {
                System.out.println("Please provide a natural number as input.");
                return;
            }

            int n = Integer.parseInt(args[0]);


            if (n <= 0) {
                System.out.println("Please enter a valid natural number (greater than 0).");
            } else {

                int sumRecursive = recursiveSum(n);


                int sumFormula = formulaSum(n);


                System.out.println("Sum using recursion: " + sumRecursive);
                System.out.println("Sum using formula: " + sumFormula);

                if (sumRecursive == sumFormula) {
                    System.out.println("✅ Both methods give the same result!");
                } else {
                    System.out.println("❌ Results do not match. Check your code.");
                }
            }
        }





}
