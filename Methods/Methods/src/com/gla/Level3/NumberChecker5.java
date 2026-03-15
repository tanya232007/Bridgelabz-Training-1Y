package com.gla.Level3;
import java.util.Scanner;

public class NumberChecker5 {


        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        public static boolean isNeon(int n) {
            int sq = n * n;
            int sum = 0;
            while (sq > 0) {
                sum += sq % 10;
                sq /= 10;
            }
            return sum == n;
        }

        public static boolean isSpy(int n) {
            int sum = 0, prod = 1;
            int temp = n;
            while (temp > 0) {
                int d = temp % 10;
                sum += d;
                prod *= d;
                temp /= 10;
            }
            return sum == prod;
        }

        public static boolean isAutomorphic(int n) {
            int sq = n * n;
            String s1 = String.valueOf(n);
            String s2 = String.valueOf(sq);
            return s2.endsWith(s1);
        }

        public static boolean isBuzz(int n) {
            return (n % 7 == 0 || n % 10 == 7);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            System.out.println("Prime: " + isPrime(num));
            System.out.println("Neon: " + isNeon(num));
            System.out.println("Spy: " + isSpy(num));
            System.out.println("Automorphic: " + isAutomorphic(num));
            System.out.println("Buzz: " + isBuzz(num));
        }
    }

