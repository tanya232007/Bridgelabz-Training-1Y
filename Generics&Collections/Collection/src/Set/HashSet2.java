package Set;

import java.util.LinkedHashSet;


public class HashSet2 {
    static void main(String[] args) {


        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(200);
        System.out.println(set2);


    }
}

