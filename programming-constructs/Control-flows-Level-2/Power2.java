import java.util.Scanner;
class Power2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
System.out.println("enter power");
int p=sc.nextInt();
int result=1;
int counter=0;
while(counter<p)
{
result=result*n;
counter++;
}
System.out.println("result="+result);
}
}

