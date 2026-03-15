package com.gla.Level3;


    import java.util.Scanner;

    public class NumberCheckerExtended {

        public static int[] getDigitsArray(int n) {
            String s = String.valueOf(Math.abs(n));
            int[] digits = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                digits[i] = Character.getNumericValue(s.charAt(i));
            }
            return digits;
        }

        public static int findSumDigits(int[] digits) {
            int sum = 0;
            for (int d : digits) sum += d;
            return sum;
        }

        public static double findSumSquares(int[] digits) {
            double sumSq = 0;
            for (int d : digits) sumSq += Math.pow(d, 2);
            return sumSq;
        }

        public static boolean isHarshad(int n, int[] digits) {
            int sum = findSumDigits(digits);
            return n % sum == 0;
        }

        public static void findFrequency(int[] digits) {
            int[][] freq = new int[10][2];
            for (int i = 0; i < 10; i++) freq[i][0] = i;

            for (int d : digits) {
                freq[d][1]++;
            }

            System.out.println("Digit | Frequency");
            for (int i = 0; i < 10; i++) {
                if (freq[i][1] > 0) {
                    System.out.println(freq[i][0] + "     | " + freq[i][1]);
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            int[] digits = getDigitsArray(num);
            System.out.println("Sum of Digits: " + findSumDigits(digits));
            System.out.println("Sum of Squares: " + findSumSquares(digits));
            System.out.println("Is Harshad: " + isHarshad(num, digits));
            findFrequency(digits);
        }
    }


