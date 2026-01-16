import java.util.Scanner;
class Max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:-");
int n=sc.nextInt();
int Total_Handshakes=(n*(n-1))/2;
System.out.println("Possible no of handshakes:-"+Total_Handshakes);
}
}
