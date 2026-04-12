package MultiThreading;

public class main {
    public static void main(String[] args) {
        A thread1 = new A();
        B thread2 = new B();

        thread1.start();
        thread2.start();

    }
}