package com.Encapsulation;


    class Book extends LibraryItem implements Reservable {
        private boolean isAvailable = true;
        private String borrower;

        public Book(String itemId, String title, String author) {
            super(itemId, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 14; // 14 days
        }

        public void reserveItem(String user) {
            if (isAvailable) {
                borrower = user;
                isAvailable = false;
                System.out.println("Book reserved by " + user);
            } else {
                System.out.println("Book not available");
            }
        }

        public boolean checkAvailability() {
            return isAvailable;
        }
    }

