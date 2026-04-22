package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    static void main(String[] args) {

        List<Employee> list= Arrays.asList(new Employee(101,"Ram",2000),
                new Employee(102,"Shyam",30000),
                new Employee(103,"sham",29800));

        System.out.println("List of new Employee:-"+list);
        for(Employee e1:list){
            System.out.println(e1);

        }
        Collections.sort(list,(Employee a,Employee b)-> a.id-b.id);
        System.out.println("This is a sorted .id:-");

        for(Employee e1:list){
            System.out.println(e1);

        }
        System.out.println("This is a sorted .id:-");



    }
}
