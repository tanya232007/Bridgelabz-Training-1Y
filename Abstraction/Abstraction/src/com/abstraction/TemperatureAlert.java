package com.abstraction;


    import java.util.function.Predicate;

    class TemperatureAlert {
        private double threshold;
        private Predicate<Double> alertCondition;

        public TemperatureAlert(double threshold) {
            this.threshold = threshold;
            this.alertCondition = temp -> temp > threshold;
        }

        public void checkTemperature(double currentTemp) {
            if (alertCondition.test(currentTemp)) {
                System.out.println("⚠ ALERT: Temperature crossed threshold! Current = " + currentTemp);
            } else {
                System.out.println("✅ Safe: Current temperature = " + currentTemp);
            }
        }
    }


