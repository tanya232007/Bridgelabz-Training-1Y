import java.util.Scanner;
class Yards
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter distance in Feet:-");
double Feet=sc.nextInt();
double Yard=3*Feet;
System.out.println("Convert Feet into yard:-"+Yard);
double Miles=1760*Yard;
System.out.println("Convert Yard into Miles:-"+Miles);
}
}
