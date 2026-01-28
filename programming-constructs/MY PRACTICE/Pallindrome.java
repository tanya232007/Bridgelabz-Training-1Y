import java.util.Scanner;
class Pallindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:-");
int num=sc.nextInt();
int temp=num;
int rev=0;
int rem=0;
while(temp!=0)
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(temp==rev)
{
System.out.println("No is pallindrome");
}
else
{
System.out.println("No is not pallindrome");
}
}
}



