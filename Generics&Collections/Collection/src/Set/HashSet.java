package Set;

import java.util.Set;

public class HashSet {

    static void main(String[] args) {

        Set<Integer> set1 = new java.util.HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(10);
        System.out.println(set1);


    }
}
