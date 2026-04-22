package lambda;

import java8.Demo;

public class main {
    static void main(String[] args) {


        Demo d1 = () ->
        {
            System.out.println("This is my first lambda expression");
            int a=20,b=10;
            int c=a+b;
            int d=a/b;
            int e=a-b;
            int f=a*b;
            int g=b%a;
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);


        };
        d1.info();
    }
}

