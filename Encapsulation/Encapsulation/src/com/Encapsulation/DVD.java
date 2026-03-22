package com.Encapsulation;

    class DVD extends LibraryItem implements Reservable {
        private boolean isAvailable = true;
        private String borrower;

        public DVD(String itemId, String title, String author) {
            super(itemId, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 5; // 5 days
        }

        public void reserveItem(String user) {
            if (isAvailable) {
                borrower = user;
                isAvailable = false;
                System.out.println("DVD reserved by " + user);
            } else {
                System.out.println("DVD not available");
            }
        }

        public boolean checkAvailability() {
            return isAvailable;
        }
    }

