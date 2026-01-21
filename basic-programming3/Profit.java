import java.util.Scanner;
class Profit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter CP:-");
int CP=sc.nextInt();
System.out.println("Enter SP:-");
int SP=sc.nextInt();
double Profit=SP-CP;
System.out.println("Find Profit:-"+Profit);
double Profit_Percentage=(Profit*100)/CP;
System.out.println("Find Profit Percentage:"+Profit_Percentage);
}
}
