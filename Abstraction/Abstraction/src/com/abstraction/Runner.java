package com.abstraction;

public class Runner {
    public static void main(String[] args) {

        PartTimeEmployee p1=new PartTimeEmployee("Tanya",101,0);
        p1.displayinfo();
        System.out.println("Paid to Part Time Employee :-");
        double paidToEmployee=p1.salarycalculation(6,1000);
        System.out.println(paidToEmployee);
        System.out.println("---------------------------------------------------------");

        PartTimeEmployee p2=new PartTimeEmployee("Tanya",101,0);
        double paid=p2.salarycalculation(3,300);
        p2.displayinfo();
        System.out.println(paid);

    }
}
