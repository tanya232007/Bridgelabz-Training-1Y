import java.util.Scanner;

class BMICalculator2D 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        
        
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        
        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nPerson " + (i + 1));

            
            double h;
            do 
			{
                System.out.print("Enter height (in meters, positive): ");
                h = sc.nextDouble();
            } 
			while (h <= 0);

            
            double w;
            do 
			{
                System.out.print("Enter weight (in kg, positive): ");
                w = sc.nextDouble();
            } 
			while (w <= 0);

            personData[i][0] = h;
            personData[i][1] = w; 

            
            double bmi = w / (h * h);
            personData[i][2] = bmi;

            
            if (bmi < 18.5)
			{
                weightStatus[i] = "Underweight";
            } 
			else if (bmi < 25)
			{
                weightStatus[i] = "Normal weight";
            } 
			else if (bmi < 30)
			{
                weightStatus[i] = "Overweight";
            }
			else 
			{
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) 
		{
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " m");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
