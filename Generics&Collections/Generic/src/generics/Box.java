package generics;

import java.util.ArrayList;

public class Box {

    static void main() {
        ArrayList list=new ArrayList();
        list.add("Tanya");
        list.add(1);
        list.add(121.121);
        list.add('T');

        System.out.println(list);
        int index = (int) list.get(1);
        System.out.println(index);

    }
}
