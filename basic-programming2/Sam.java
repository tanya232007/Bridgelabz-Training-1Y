import java.util.Scanner;
class Sam
{
  public static void main(String args [])
   {  
       Scanner S=new Scanner(System.in);
	   
	   System.out.println("Enter First sub=");
	   int maths=S.nextInt();
	   System.out.println("Enter Second sub=");
	   int physics=S.nextInt();
	   System.out.println("Enter Third sub=");
	   int che=S.nextInt();
	   int Average=(maths+physics+che)/3;
	   System.out.println("Total average="+Average);
    }
}
	   
	   