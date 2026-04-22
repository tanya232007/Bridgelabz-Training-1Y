package Collections;

import java.util.LinkedList;

public class Runner {
    static void main(String[] args) {
        LinkedList<Employee> e1=new LinkedList<>();

        e1.add(new Employee(101,"Saurab",600000));
        e1.add(new Employee(102,"Rahul",30000));
        e1.add(new Employee(103,"Kiran",70000));

        System.out.println("List of Employee By Using 'add()' :-"+e1);

        for(Employee p1:e1)
        {
            System.out.println(p1);
        }

    }
}
