import java.util.Scanner;
class Multiples
{
   public static void main(String args[])
   {
   
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number(less than 100)");
       int n=sc.nextInt();
	   for(int i=100;i>=1;i--)
	   {
	     if(i%n==0)
		 {
		    System.out.println(i);
		 }
	   } 
	}
}
	
	    


