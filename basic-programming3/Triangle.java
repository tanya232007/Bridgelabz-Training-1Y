import java.util.Scanner;
class Triangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter h in cm:-");
double h=sc.nextInt();
System.out.println("enter b in cm:-");
double b=sc.nextInt();
double Area_cm=b*h*0.5;
double Area_inch=Area_cm/(2.54*2.54);
System.out.println("area of triangle in cm:-"+Area_cm);
System.out.println("area of triangle in inch:-"+Area_inch);
}
}


