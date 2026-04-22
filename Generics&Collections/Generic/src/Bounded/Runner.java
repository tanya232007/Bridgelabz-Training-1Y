package Bounded;

public class Runner {
        public static void main(String[] args) {

            Student<String, Integer, Double> s1 = new Student<>("Tanya", 63, 89.5);

            System.out.println("Name: " + s1.getName());
            System.out.println("Roll No: " + s1.getRollno());
            System.out.println("Percentage: " + s1.getPercentage());

            s1.extraInfo();




        }
}

