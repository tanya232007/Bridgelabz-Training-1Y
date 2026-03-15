package com.gla.Level1;
//An athlete runs in a triangular park with sides provided as input by the user in meters. If the
//athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint =>
//a. Take user input for 3 sides of a triangle
//b. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//c. Write a Method to compute the number of rounds user needs to do to complete 5km run


public class TriangularParkRun {
    public static void calculateRounds(int side1, int side2, int side3) {
        int perimeter = side1 + side2 + side3;   // perimeter in meters
        int distance = 5000;                     // 5 km = 5000 meters
        double rounds = (double) distance / perimeter;

        System.out.println("Perimeter of park: " + perimeter + " meters");
        System.out.println("Number of rounds needed: " + rounds);
    }

    public static void main(String[] args) {


        int side1 = 100;
        int side2 = 150;
        int side3 = 200;

        calculateRounds(side1, side2, side3);
    }
}








