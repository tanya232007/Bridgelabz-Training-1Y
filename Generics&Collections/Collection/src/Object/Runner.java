package Object;

import java.util.ArrayList;

public class Runner {
    static void main(String[] args) {

        ArrayList<Student> student=new ArrayList<>();
        student.add(new Student(101,78.98,"Ram"));
        student.add(new Student(102,98.23,"Sham"));
        student.add(new Student(103,89.76,"Sita"));
        student.add(new Student(104,92.00,"Gita"));

        System.out.println("List Of Students :- "+student);



    }
}
