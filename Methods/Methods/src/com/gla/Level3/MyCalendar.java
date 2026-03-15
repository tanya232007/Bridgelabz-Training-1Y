package com.gla.Level3;
import java.util.Scanner;

public class MyCalendar{
    public static String getMonthName(int month) {
            String[] months = {"", "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            return months[month];
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public static int getDaysInMonth(int month, int year) {
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month == 2 && isLeapYear(year)) return 29;
            return days[month];
        }

        public static int getFirstDayOfMonth(int month, int year) {
            int d = 1;
            int y = year - (14 - month) / 12;
            int x = y + y/4 - y/100 + y/400;
            int m = month + 12 * ((14 - month) / 12) - 2;
            return (d + x + (31 * m) / 12) % 7;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter month (1-12) and year: ");
            int m = sc.nextInt();
            int y = sc.nextInt();

            String monthName = getMonthName(m);
            int days = getDaysInMonth(m, y);
            int startDay = getFirstDayOfMonth(m, y);

            System.out.println("\n    " + monthName + " " + y);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            for (int i = 1; i <= days; i++) {
                System.out.printf("%3d ", i);
                if (((i + startDay) % 7 == 0) || (i == days)) System.out.println();
            }
        }
    }

