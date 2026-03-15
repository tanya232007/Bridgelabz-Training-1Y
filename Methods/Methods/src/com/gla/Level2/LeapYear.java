package com.gla.Level2;
//Write a program that takes a year as input and outputs the Year is a Leap Year or not
//Hint =>
//a. The LeapYear program only works for year >= 1582, corresponding to a year in the
//Gregorian calendar.
//b. Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
//c. Write a method to check for Leap Year using the conditions a and b

public class LeapYear {

        public static void checkLeapYear(int year) {

            if (year < 1582) {
                System.out.println("Leap year calculation is valid only for year >= 1582.");
                return;
            }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        public static void main(String[] args) {

            if (args.length == 0) {
                System.out.println("Please provide a year as input.");
                return;
            }

            int year = Integer.parseInt(args[0]);


            checkLeapYear(year);
        }
    }


