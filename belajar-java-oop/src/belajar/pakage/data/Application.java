package belajar.pakage.data;

public class Application {
    public static final int PROCESSOR;
    static {
        System.out.println("Mengakses Class Appliaction");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
