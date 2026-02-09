import java.util.Scanner;
class StudentGrades2D 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        
        
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        
        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nStudent " + (i + 1));

          
            int p;
            do 
			{
                System.out.print("Enter Physics marks (positive): ");
                p = sc.nextInt();
            }
			while (p < 0);

            
            int c;
            do 
			{
                System.out.print("Enter Chemistry marks (positive): ");
                c = sc.nextInt();
            } 
			while (c < 0);

            
            int m;
            do 
			{
                System.out.print("Enter Maths marks (positive): ");
                m = sc.nextInt();
            } 
			while (m < 0);

            
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;

            
            int total = p + c + m;
            percentage[i] = total / 3.0;

            
            if (percentage[i] >= 90) 
			{
                grade[i] = "A";
            } 
			else if (percentage[i] >= 75) 
			{
                grade[i] = "B";
            } 
			else if (percentage[i] >= 50)
			{
                grade[i] = "C";
            } 
			else 
			{
                grade[i] = "D";
            }
        }

        
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++)
		{
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}