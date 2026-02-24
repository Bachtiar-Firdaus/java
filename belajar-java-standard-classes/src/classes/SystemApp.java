package classes;

public class SystemApp {
    static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("LOCALAPPDATA"));
        System.out.println(System.getenv("APP"));

        System.gc();
        System.exit(0);
        System.out.println("Hi ");

    }
}
