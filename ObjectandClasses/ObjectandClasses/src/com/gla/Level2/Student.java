package com.gla.Level2;

public class Student {
        private String name;
        private int rollno;
        private int marks;
        public Student(String name, int rollno, int marks){
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
        }
        String calculateGrade(){
            if(marks >= 90)
                return "A";
            else if(marks >= 75)
                return "B";
            else if(marks >= 60)
                return "C";
            else if(marks >= 40)
                return "D";
            else
                return "Fail";
        }
        public void displayDetail(){
            System.out.println("Name : "+name);
            System.out.println("Rollno : "+rollno);
            System.out.println("Marks :"+marks);
            System.out.println("Grade : "+calculateGrade());
        }
        public static void main(String args[]){
            Student s1 = new Student("Ram",12,98);
            s1.displayDetail();

            System.out.println();

            Student s2 = new Student("Ankit",34,89);
            s2.displayDetail();
        }
    }

