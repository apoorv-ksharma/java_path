public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Test.increment();
        System.out.println(Test.number);
        Test.increment();

        System.out.println(Test.number);

    }
}

class Test {
    static {
        System.out.println("class initialized");
    }

    public static int number = 0;

    public static void increment() {
        number++;
    }
}