package com.abstraction;

public class PartTimeEmployee extends Employee{

    String dep;

    public PartTimeEmployee(String name,int id,double salary)
    {
        super(name,id,salary);
        this.dep=dep;
    }

    @Override
    public double salarycalculation(int hours, int rate) {
        return hours*rate;
    }
    public void printInfo_PartTimeEmpployee()
    {
        System.out.println("Department :-"+dep);
    }


}


