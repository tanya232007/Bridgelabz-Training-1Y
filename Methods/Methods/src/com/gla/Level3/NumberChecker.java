package com.gla.Level3;
import java.util.Scanner;

public class NumberChecker {


        public static int countDigits(int n) {
            return String.valueOf(Math.abs(n)).length();
        }

        public static int[] getDigits(int n) {
            String s = String.valueOf(Math.abs(n));
            int[] digits = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                digits[i] = Character.getNumericValue(s.charAt(i));
            }
            return digits;
        }

        public static boolean isDuckNumber(int[] digits) {
            for (int d : digits) {
                if (d == 0) return true;
            }
            return false;
        }

        public static boolean isArmstrong(int n, int[] digits) {
            int sum = 0;
            int p = digits.length;
            for (int d : digits) {
                sum += Math.pow(d, p);
            }
            return sum == n;
        }

        public static void findLargest(int[] digits) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int d : digits) {
                if (d > max1) {
                    max2 = max1;
                    max1 = d;
                } else if (d > max2 && d != max1) {
                    max2 = d;
                }
            }
            System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
        }

        public static void findSmallest(int[] digits) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for (int d : digits) {
                if (d < min1) {
                    min2 = min1;
                    min1 = d;
                } else if (d < min2 && d != min1) {
                    min2 = d;
                }
            }
            System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            int[] digits = getDigits(num);
            System.out.println("Is Duck Number: " + isDuckNumber(digits));
            System.out.println("Is Armstrong: " + isArmstrong(num, digits));
            findLargest(digits);
            findSmallest(digits);
        }
    }

