package com.gla.Level1;
//Write a program SpringSeason that takes two int values month and day from the command
//line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring
//season and return a boolean true or false

public class SpringSeason {


        public static void checkSpring(int month, int day)
        {
            if ((month == 3 && day >= 20) || (month == 4) || (month == 5) ||
                    (month == 6 && day <= 20))
            {
                System.out.println("It's a Spring Season");
            }
            else
            {
                System.out.println("Not a Spring Season");
            }
        }

        public static void main(String[] args)
        {

            if (args.length >= 2)
            {
                int month = Integer.parseInt(args[0]);
                int day = Integer.parseInt(args[1]);


                checkSpring(month, day);
            }
            else
            {
                System.out.println("Please provide month and day as input.");

            }


            }
        }


