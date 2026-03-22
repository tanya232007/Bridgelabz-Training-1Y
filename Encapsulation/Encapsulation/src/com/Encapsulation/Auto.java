package com.Encapsulation;


    class Auto extends Vehicle implements GPS {
        private String location;

        public Auto(String vehicleId, String driverName, double ratePerKm) {
            super(vehicleId, driverName, ratePerKm);
        }

        @Override
        public double calculateFare(double distance) {
            return distance * getRatePerKm();
        }

        public String getCurrentLocation() {
            return location;
        }

        public void updateLocation(String location) {
            this.location = location;
        }
    }

