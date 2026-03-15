package com.gla.Level3;
import java.util.Scanner;

public class NumberChecker6 {


        public static int sumDivisors(int n) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) sum += i;
            }
            return sum;
        }

        public static boolean isPerfect(int n) {
            return sumDivisors(n) == n;
        }

        public static boolean isAbundant(int n) {
            return sumDivisors(n) > n;
        }

        public static boolean isDeficient(int n) {
            return sumDivisors(n) < n;
        }

        public static long factorial(int n) {
            long fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            return fact;
        }

        public static boolean isStrong(int n) {
            int temp = n;
            long sum = 0;
            while (temp > 0) {
                sum += factorial(temp % 10);
                temp /= 10;
            }
            return sum == n;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            System.out.println("Perfect: " + isPerfect(num));
            System.out.println("Abundant: " + isAbundant(num));
            System.out.println("Deficient: " + isDeficient(num));
            System.out.println("Strong: " + isStrong(num));
        }
    }

