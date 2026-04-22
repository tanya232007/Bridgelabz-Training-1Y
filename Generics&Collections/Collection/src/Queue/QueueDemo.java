package Queue;

import java.util.PriorityQueue;

public class QueueDemo {
    static void main(String[] args) {

        PriorityQueue<String> p1=new PriorityQueue<>();
        p1.add("Tanyu");
        p1.add("Soniya");
        p1.add("Muskan");
        p1.add("Riya");
        p1.add("Sonam");
        System.out.println(p1);

        String s1=p1.element();
        System.out.println("It will give the head:-"+p1);

        String s2=p1.peek();
        System.out.println(s2);

        p1.remove("Sonam");
        System.out.println("Remove this name:-"+p1);

        p1.poll();
        System.out.println(p1);

        p1.offer("Tanyu");
        System.out.println(p1);
    }
}





