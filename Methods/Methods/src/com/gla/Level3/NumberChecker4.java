package com.gla.Level3;
import java.util.Scanner;


public class NumberChecker4 {


        public static int[] getDigits(int n) {
            String s = String.valueOf(Math.abs(n));
            int[] digits = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                digits[i] = Character.getNumericValue(s.charAt(i));
            }
            return digits;
        }

        public static int[] reverseArray(int[] arr) {
            int[] rev = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                rev[i] = arr[arr.length - 1 - i];
            }
            return rev;
        }

        public static boolean compareArrays(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) return false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
            return true;
        }

        public static boolean isPalindrome(int[] digits) {
            int[] reversed = reverseArray(digits);
            return compareArrays(digits, reversed);
        }

        public static boolean isDuckNumber(int[] digits) {
            for (int d : digits) {
                if (d == 0) return true;
            }
            return false;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            int[] digits = getDigits(num);
            System.out.println("Is Palindrome: " + isPalindrome(digits));
            System.out.println("Is Duck Number: " + isDuckNumber(digits));
        }
    }

