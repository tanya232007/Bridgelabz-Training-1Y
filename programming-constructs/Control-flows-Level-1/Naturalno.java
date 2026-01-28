import java.util.Scanner;
class Naturalno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a natural no:-");
int n=sc.nextInt();
if(n>0)
{
int sum=n*(n+1)/2;
System.out.println("number is natural:+sum");
}
else
{
System.out.println("number is not natural:+sum");
}
}
}

