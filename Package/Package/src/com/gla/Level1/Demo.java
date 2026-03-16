package com.gla.Level1;


import static java.lang.Double.max;
import static java.lang.Double.min;
import static java.lang.StrictMath.*;

public class Demo {

        public static void main(String[] args) {
            double a = -25.0;
            double b = 9.0;
            double c = 16.0;

            // Demonstrating five static methods
            System.out.println("Absolute value of a: " + abs(a));
            System.out.println("Square root of b: " + sqrt(b));
            System.out.println("Power (2^3): " + pow(2, 3));
            System.out.println("Maximum of b and c: " + max(b, c));
            System.out.println("Minimum of b and c: " + min(b, c));
        }
    }

