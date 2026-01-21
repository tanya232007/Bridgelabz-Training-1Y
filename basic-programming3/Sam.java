import java.util.Scanner;
class Sam
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter maths number:-");
double a=sc.nextInt();
System.out.println("enter physics number:-");
double b=sc.nextInt();
System.out.println("enter chemistry number:-");
double c=sc.nextInt();
double Average=(a+b+c)/3;
System.out.println("Average number="+Average);
}
}
