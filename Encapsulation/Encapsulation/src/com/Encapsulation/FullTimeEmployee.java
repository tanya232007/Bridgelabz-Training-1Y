package com.Encapsulation;


    class FullTimeEmployee extends Employee implements Department {
        private String department;

        public FullTimeEmployee(int id, String name, double salary) {
            super(id, name, salary);
        }

        @Override
        public double calculateSalary() {
            return getBaseSalary() + 5000;
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

