import java.util.Scanner;
class Height
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter height in cm:-");
int cm=sc.nextInt();
double inch=2.54*cm;
System.out.println("Convert cm into inch:-"+inch);
double feet=12*inch;
System.out.println("Convert inch into feet:-"+feet);
}
}

