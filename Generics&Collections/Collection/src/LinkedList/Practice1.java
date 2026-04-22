package LinkedList;

import java.util.LinkedList;

public class Practice1 {

    static void main(String[] args) {

        LinkedList<Integer> l1=new LinkedList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);

        System.out.println(l1);

        l1.addFirst(1);
        System.out.println("First Added:-"+l1);

        l1.addLast(1000);
        System.out.println("Last Added:-"+l1);


//        System.out.println("Reversed :-"+l1.reversed());

        l1.remove();
        System.out.println("remove First:-"+l1);
        System.out.println("Reversed :-"+l1.reversed());


    }
}
