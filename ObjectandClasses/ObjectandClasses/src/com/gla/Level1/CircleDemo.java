package com.gla.Level1;

public class CircleDemo {


        static class Circle {
            private double radius;

            // Constructor
            Circle(double radius) {
                this.radius = radius;
            }

            double calculateArea() {
                return Math.PI * radius * radius;
            }

            double calculateCircumference() {
                return 2 * Math.PI * radius;
            }

            void display() {
                System.out.println("Radius: " + radius);
                System.out.println("Area: " + calculateArea());
                System.out.println("Circumference: " + calculateCircumference());
            }
        }


        public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            circle.display();
        }
    }


