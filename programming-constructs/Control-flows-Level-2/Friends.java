import java.util.Scanner;
class Friends
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter age1");
	 int a1=sc.nextInt();
	 System.out.println("enter age2");
	 int a2=sc.nextInt();
	 System.out.println("enter age3");
	 int a3=sc.nextInt();
	 System.out.println("enter height1");
	 int h1=sc.nextInt();
	 System.out.println("enter height2");
	 int h2=sc.nextInt();
	 System.out.println("enter height3");
	 int h3=sc.nextInt();
	 if(a1<=a2 && a2<=a3)
	 {
	    System.out.println("youngest age"+a1);
	 }
	 else if(a2<=a1 && a2<=a3)
	 {
	    System.out.println("youngest age"+a2);
	 }
	 
	 else
	 {
	    System.out.println("youngest age"+a3);
	 }
	 
	 
	 if(h1>=h2 && h1>=h3)
	 {
	    System.out.println("tallest height"+h1);
	 }
	 else if(h2>=h1 && h2>=h3)
	 {
	    System.out.println("tallest height"+h2);
	 }
	 
	 else
	 {
	    System.out.println("tallest height"+h3);
	 }
	}
}
	
	 
	 
	 
	 