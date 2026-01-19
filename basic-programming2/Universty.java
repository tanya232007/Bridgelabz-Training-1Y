import java.util.Scanner;
class Universty
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the students fees:");
double fees=s.nextDouble();
System.out.println("enter the discount %");
double discountpercentage=s.nextDouble();
double dis=(fee*discountpercentage)/100;
double disfees=fee-dis;
System.out.println("the final discount amount is:"+dis +"the final discount fee is:"+disfees);
}
}
