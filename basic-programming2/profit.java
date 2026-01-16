import java.util.Scanner;
class Profit
{
  public static void main(String args [])
  {
   Scanner S=new Scanner(System.in);
   System.out.println("Enter costprice:");
   int cp=S.nextInt();
   System.out.println("Enter sellingprice:");
   int sp=S.nextInt();
   double Profit=sp-cp;
   System.out.println("Find Profit:-"+Profit);
   double profit_percentage=(profit*100)/cp;
   System.out.println("Find profit percentage:-"+Profit_Percentage);
  }
}
   
   
      