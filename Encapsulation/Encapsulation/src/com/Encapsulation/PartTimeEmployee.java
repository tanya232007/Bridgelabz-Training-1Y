package com.Encapsulation;

    class PartTimeEmployee extends Employee implements Department {
        private int hoursWorked;
        private String department;

        public PartTimeEmployee(int id, String name, double hourlyRate, int hours) {
            super(id, name, hourlyRate);
            this.hoursWorked = hours;
        }

        @Override
        public double calculateSalary() {
            return getBaseSalary() * hoursWorked;
        }

        @Override
        public void assignDepartment(String deptName) {
            this.department = deptName;
        }

        @Override
        public String getDepartmentDetails() {
            return "Department: " + department;
        }
    }

