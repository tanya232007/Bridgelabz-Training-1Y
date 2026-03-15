package com.gla.Level1;

public class ItemDemo {

        static class Item {
            String itemCode;
            String itemName;
            double price;


            Item(String code, String name, double p) {
                itemCode = code;
                itemName = name;
                price = p;
            }


            void displayItemDetails() {
                System.out.println("Item Code: " + itemCode);
                System.out.println("Item Name: " + itemName);
                System.out.println("Price: " + price);
            }


            double calculateTotalCost(int quantity) {
                return price * quantity;
            }
        }

        public static void main(String[] args) {
            // Create an item
            Item item = new Item("A101", "Notebook", 50.0);

            // Show details
            item.displayItemDetails();


            int quantity = 3;
            double totalCost = item.calculateTotalCost(quantity);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + totalCost);
        }
    }

