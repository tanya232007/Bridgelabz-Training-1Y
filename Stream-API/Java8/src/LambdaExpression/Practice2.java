package LambdaExpression;

public class Practice2 {
    static void main(String[] args) {

        Runnable r1 = ()->
        {
            System.out.println("This is a Runnable Interference");
        };
        Thread t1=new Thread(r1);
        t1.start();

        Runnable r2 = ()->
        {
            for(int i=0; i<=10; i++)
                System.out.println(i);
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2=new Thread(r2);
        t2.start();


    }
}
