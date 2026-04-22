package LambdaExpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {

    static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,20,30,50,70);

        System.out.println(list);

        Collections.sort(list);
        System.out.println("This is sorted :-"+list);

        Collections.shuffle(list);
        System.out.println("This list is shuffle :-"+list);

        Integer min= Collections.min(list);
        System.out.println("This is min list:-"+min);

        Integer max=Collections.max(list);
        System.out.println("This is max list:-"+max);

        Collections.reverseOrder();
        System.out.println(list);






    }
}
