import java.util.Scanner;
class Vote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
int a=sc.nextInt();
if(a<=18)
{
System.out.println("Person is eligible:");
}
else
{
System.out.println("Person is not eligible:");
}
}
}
