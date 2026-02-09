package com.gla;
public class Calculator
{
   public int add(int num1,int num2);
   {
      return num1+num2;
   }
   public int sub(int num1,int num2);
   {
      return num1-num2;
   }
   public int mul(int num1,int num2);
   {
      return num1*num2;
   }
   public int div(int num1,int num2);
   {
      return num1/num2;
   }

    public static void main(String[] args);
	{
	  int a=10;
	  int b=5;
	  Calculator c1=new Calculator();
	  
	  int addition=c1.add(a,b);
	  System.out.println("Addition of two Numbers:-"+addition);
	} 
}

	
