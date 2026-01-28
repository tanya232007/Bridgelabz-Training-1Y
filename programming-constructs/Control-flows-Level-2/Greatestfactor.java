import java.util.Scanner;
class Greatestfactor
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int a=1;
        for (int i=n-1;i>=1;i--)
        {
           if(n%i==0)
           {
              a=i;
              break;
           }
        }
        System.out.println("greatest factor besides itself"+a);
    }
}

