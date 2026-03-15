package com.gla.Level1;
//Write a program to find the smallest and the largest of the 3 numbers.
//        Hint =>
//a. Take user input for 3 numbers
//b. Write a single method to find the smallest and largest of the three numbers

public class SmallestLargest{
        public static void findSmallestLargest(int a, int b, int c) {
            int smallest = a;
            int largest = a;


            if (b < smallest)
            {
                smallest = b;
            }
            if (b > largest)
            {
                largest = b;
            }


            if (c < smallest)
            {
                smallest = c;
            }
            if (c > largest) {
                largest = c;
            }


            System.out.println("Smallest number is: " + smallest);
            System.out.println("Largest number is: " + largest);
        }

        public static void main(String[] args) {

            if (args.length >= 3) {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int num3 = Integer.parseInt(args[2]);

                findSmallestLargest(num1, num2, num3);
            } else {
                System.out.println("Please provide 3 numbers as input.");
            }
        }
    }


