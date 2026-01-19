import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value of a:-");
int a=sc.nextInt();
System.out.println("enter value of b:-");
int b=sc.nextInt();
int add=a+b;
int sub=a-b;
int mul=a*b;
float div=a/b;
System.out.println("Addition:-"+add);
System.out.println("Subtraction:-"+sub);
System.out.println("Multiplaction:-"+mul);
System.out.println("Division:-"+div);

}
}



