package com.Encapsulation;


    abstract class Vehicle {
        private String vehicleId;
        private String driverName;
        private double ratePerKm;

        // constructor
        public Vehicle(String vehicleId, String driverName, double ratePerKm) {
            this.vehicleId = vehicleId;
            this.driverName = driverName;
            this.ratePerKm = ratePerKm;
        }

        // getters
        public String getVehicleId() {
            return vehicleId;
        }

        public String getDriverName() {
            return driverName;
        }

        public double getRatePerKm() {
            return ratePerKm;
        }

        // abstract method
        public abstract double calculateFare(double distance);

        // normal method
        public void getVehicleDetails() {
            System.out.println("Vehicle ID: " + vehicleId);
            System.out.println("Driver Name: " + driverName);
            System.out.println("Rate per km: " + ratePerKm);
        }
    }

