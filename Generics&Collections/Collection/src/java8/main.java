package java8;

public class main {
    static void main(String[] args)
    {
        Demo d1=new Demo()
        {
            @Override
            public void info()
            {


                System.out.println("this is my first anonymous class");
            }

        };
            d1.info();

            Demo d2=new Demo() {
                @Override
                public void info() {
                    System.out.println("this is my second anonymous class");
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


//                    int s=30,t=5;
//                    int u=s/t;
//                    System.out.println(u);


                }
            };
            d2.info();


    }
}
