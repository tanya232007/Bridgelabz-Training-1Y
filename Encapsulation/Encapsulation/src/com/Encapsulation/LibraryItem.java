package com.Encapsulation;

    abstract class LibraryItem {
        private String itemId;
        private String title;
        private String author;

        // constructor
        public LibraryItem(String itemId, String title, String author) {
            this.itemId = itemId;
            this.title = title;
            this.author = author;
        }

        // getters (encapsulation)
        public String getItemId() {
            return itemId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        // abstract method
        public abstract int getLoanDuration();

        // normal method
        public void getItemDetails() {
            System.out.println("ID: " + itemId);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

