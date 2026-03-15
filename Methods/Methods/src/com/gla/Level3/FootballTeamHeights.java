package com.gla.Level3;
//Create a program to find the shortest, tallest, and mean height of players present in a
//football team.
//Hint =>
//a. The formula to calculate the mean is: mean = sum of all elements/number of elements
//b. Create an int array named heights of size 11 and get 3 digits random height in cms for
//each player in the range 150 cms to 250 cms
//c. Write the method to Find the sum of all the elements present in the array.
//d. Write the method to find the mean height of the players on the football team
//e. Write the method to find the shortest height of the players on the football team
//f. Write the method to find the tallest height of the players on the football team
//g. Finally display the results

    import java.util.Random;

    public class FootballTeamHeights {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] heights = new int[11];


            for (int i = 0; i < heights.length; i++) {
                heights[i] = rand.nextInt(101) + 150;
            }


            System.out.println("Player Heights:");
            for (int h : heights) {
                System.out.print(h + " ");
            }
            System.out.println();


            int sum = 0;
            int shortest = heights[0];
            int tallest = heights[0];

            for (int h : heights) {
                sum += h;
                if (h < shortest) shortest = h;
                if (h > tallest) tallest = h;
            }

            double mean = (double) sum / heights.length;


            System.out.println("Shortest Height: " + shortest + " cms");
            System.out.println("Tallest Height: " + tallest + " cms");
            System.out.println("Mean Height: " + mean + " cms");
        }
    }


