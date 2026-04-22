package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class DemoStack {
    static void main(String[] args) {

        Stack<String>Stack =new Stack<>();
        Stack.push("Tanya");
        Stack.push("Soniya");
        Stack.push("Sonam");
        System.out.println("This is Stack:-"+Stack);
        String s1=Stack.peek();
        System.out.println(s1);

        String s2=Stack.pop();
        System.out.println("Remove the top element:-"+s2);

        LinkedList<String> l1=new LinkedList<>();
        l1.push("Ram");
        l1.push("Shyam");
        l1.push("gita");
        l1.push("seta");
        String s3= l1.peek();
        System.out.println(s3);
        String s4= l1.peek();
        System.out.println(s4);

        String s=l1.pop();
        System.out.println(s3);

    }
}
