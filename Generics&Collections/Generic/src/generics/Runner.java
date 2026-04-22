package generics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Running Box class:");
        Box.main();

        System.out.println("\nRunning Box2 class:");
        Box2<String> stringBox = new Box2<>();
        stringBox.setValue("Hello Tanya");
        System.out.println("Box2 value: " + stringBox.getValue());

        Box2<Integer> intBox = new Box2<>();
        intBox.setValue(999);
        System.out.println("Box2 value: " + intBox.getValue());
    }
}
