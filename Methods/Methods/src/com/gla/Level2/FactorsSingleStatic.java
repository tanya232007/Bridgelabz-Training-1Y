package com.gla.Level2;
//Create a program to find the factors of a number taken as user input, store the factors in an
//array, and display the factors. Also find the sum, sum of square of factors and product of the
//factors and display the results
//Hint =>
//a. Take the input for a number
//b. Write a static Method to find the factors of the number and save them in an array and
//return the array.
//c. To find factors and save to array will have two loops. The first loop to find the count and
//initialize the array with the count. And the second loop save the factors into the array
//d. Write a method to find the sum of the factors using factors array
//e. Write a method to find the product of the factors using factors array
//f. Write a method to find the sum of square of the factors using Math.pow() method
import java.util.Scanner;

public class FactorsSingleStatic {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }


            int[] factors = new int[count];
            int index = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors[index++] = i;
                }
            }


            System.out.print("Factors of " + num + " are: ");
            for (int f : factors) {
                System.out.print(f + " ");
            }
            System.out.println();


            int sum = 0;
            long product = 1;
            double sumSq = 0;

            for (int f : factors) {
                sum += f;
                product *= f;
                sumSq += Math.pow(f, 2);
            }


            System.out.println("Sum of factors: " + sum);
            System.out.println("Product of factors: " + product);
            System.out.println("Sum of squares of factors: " + sumSq);
        }
    }

