package com.Encapsulation;

    class NonVegItem extends FoodItem implements Discountable {

        public NonVegItem(String itemName, double price, int quantity) {
            super(itemName, price, quantity);
        }

        @Override
        public double calculateTotalPrice() {
            double extraCharge = 50; // extra charge
            return (getPrice() * getQuantity()) + extraCharge;
        }

        @Override
        public double applyDiscount(double total) {
            return total * 0.95; // 5% discount
        }

        @Override
        public void getDiscountDetails() {
            System.out.println("Non-Veg Item: 5% discount applied");
        }
    }

