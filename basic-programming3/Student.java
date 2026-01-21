import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of pens:");
int pen=sc.nextInt();
System.out.println("enter name of students:");
int stu=sc.nextInt();
int que=pen/stu;
int rem=pen%stu;
System.out.println("Que of rem="+rem +que);
}
}

