package com.Encapsulation;


    import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List<Employee> employeeList = new ArrayList<>();

            FullTimeEmployee ft = new FullTimeEmployee(101, "Amit", 30000);
            ft.assignDepartment("IT");

            PartTimeEmployee pt = new PartTimeEmployee(102, "Suresh", 500, 20);
            pt.assignDepartment("Sales");

            employeeList.add(ft);
            employeeList.add(pt);

            for (Employee emp : employeeList) {
                emp.displayDetails();
                System.out.println("Final Salary: " + emp.calculateSalary());

                if (emp instanceof Department) {
                    System.out.println(((Department) emp).getDepartmentDetails());
                }
                System.out.println("-------------------------");
            }
        }
    }

