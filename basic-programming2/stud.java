import java.util.Scanner;
class Student
{
  public static void main(String args [])
   { 
      Scanner S=new Scanner(System.in);
	  System.out.println("Enter number of pens:");
	  int pen=S.nextInt();
	  System.out.println("Enter the name of students:");
	  int stu=S.nextInt();
	  int que=pen/stu;
	  int rem=pen%stu;
	  System.out.println("Que of rem="+rem +que);
	}
}
	  