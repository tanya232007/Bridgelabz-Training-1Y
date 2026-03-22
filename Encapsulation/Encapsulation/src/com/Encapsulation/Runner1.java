package com.Encapsulation;

public class Runner1 {

        // polymorphism method
        public static void processOrder(FoodItem item) {
            item.getItemDetails();

            double total = item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                total = d.applyDiscount(total);
                d.getDiscountDetails();
            }

            System.out.println("Final Price: " + total);
            System.out.println("----------------------");
        }

        public static void main(String[] args) {

            FoodItem f1 = new VegItem("Paneer", 200, 2);
            FoodItem f2 = new NonVegItem("Chicken", 300, 1);

            processOrder(f1);
            processOrder(f2);
        }
    }

