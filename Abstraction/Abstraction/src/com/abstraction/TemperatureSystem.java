package com.abstraction;


    class TemperatureSystem {
        public static void main(String[] args) {
            TemperatureAlert alert = new TemperatureAlert(40.0);
            alert.checkTemperature(35.5);
            alert.checkTemperature(42.3);
            alert.checkTemperature(39.9);
        }
    }

