package com.gla.Level1;

public class MobilePhoneDemo {
        public static void main(String[] args) {
            // Create objects
            MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 74999);
            MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 89999);

            // Display details
            System.out.println("Phone 1 Details:");
            phone1.displayDetails();

            System.out.println("\nPhone 2 Details:");
            phone2.displayDetails();
        }
    }
