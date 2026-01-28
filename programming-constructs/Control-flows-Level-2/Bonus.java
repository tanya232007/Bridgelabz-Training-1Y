import java.util.Scanner;
class Bonus
{
    public static void main(String args[])
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter salary");
           int a=sc.nextInt();
		   System.out.println("enter years");
           int b=sc.nextInt();		   
           
           if(b>5)
           {
                System.out.println("bonus="+(a*5/100));
           }
           else
           {
                System.out.println("no bonus");
           }
    }
}

