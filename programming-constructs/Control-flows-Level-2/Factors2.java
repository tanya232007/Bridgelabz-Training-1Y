import java.util.Scanner;
class Factors2
{
    public static void main(String args[])
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter number");
           int a=sc.nextInt();
		   int i=1;
		   while(i<=a)
		   {
		     if(a%i==0)
			 {
		       System.out.println(i);
		     }
			 i++;
		   }
    }
}
	
           		   