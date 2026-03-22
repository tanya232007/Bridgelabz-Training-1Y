package com.Encapsulation;

public class Runner2 {

        // polymorphism method
        public static void processItem(LibraryItem item) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;

                if (r.checkAvailability()) {
                    r.reserveItem("Soniya");
                } else {
                    System.out.println("Already reserved");
                }
            }

            System.out.println("----------------------");
        }

        public static void main(String[] args) {

            LibraryItem b = new Book("B101", "Java", "James");
            LibraryItem m = new Magazine("M101", "TechMag", "John");
            LibraryItem d = new DVD("D101", "Movie", "Director");

            processItem(b);
            processItem(m);
            processItem(d);
        }
    }

