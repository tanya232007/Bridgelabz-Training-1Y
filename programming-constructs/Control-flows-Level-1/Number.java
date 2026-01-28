import java.util.Scanner;
class Number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
int a=sc.nextInt();
if(a>0)
{
System.out.println("Number is positive:");
}
else if(a<0)
{
System.out.println("Number is negative:");
}
else
{
System.out.println("Number is zero:");
}
}
}
