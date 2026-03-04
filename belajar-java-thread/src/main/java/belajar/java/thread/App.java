package belajar.java.thread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
