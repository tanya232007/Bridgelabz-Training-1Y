package com.Encapsulation;


    class VegItem extends FoodItem implements Discountable {

        public VegItem(String itemName, double price, int quantity) {
            super(itemName, price, quantity);
        }

        @Override
        public double calculateTotalPrice() {
            return getPrice() * getQuantity();
        }

        @Override
        public double applyDiscount(double total) {
            return total * 0.9; // 10% discount
        }

        @Override
        public void getDiscountDetails() {
            System.out.println("Veg Item: 10% discount applied");
        }
    }

