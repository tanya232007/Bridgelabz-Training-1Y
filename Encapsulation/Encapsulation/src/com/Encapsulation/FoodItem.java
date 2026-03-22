package com.Encapsulation;

    abstract class FoodItem {
        private String itemName;
        private double price;
        private int quantity;

        // constructor
        public FoodItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        // getters (encapsulation)
        public String getItemName() {
            return itemName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        // abstract method
        public abstract double calculateTotalPrice();

        // normal method
        public void getItemDetails() {
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
        }
    }

