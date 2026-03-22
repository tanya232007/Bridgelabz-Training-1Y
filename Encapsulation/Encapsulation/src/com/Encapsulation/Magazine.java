package com.Encapsulation;

    class Magazine extends LibraryItem implements Reservable {
        private boolean isAvailable = true;
        private String borrower;

        public Magazine(String itemId, String title, String author) {
            super(itemId, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 7; // 7 days
        }

        public void reserveItem(String user) {
            if (isAvailable) {
                borrower = user;
                isAvailable = false;
                System.out.println("Magazine reserved by " + user);
            } else {
                System.out.println("Magazine not available");
            }
        }

        public boolean checkAvailability() {
            return isAvailable;
        }
    }

