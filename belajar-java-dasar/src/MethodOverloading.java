public class MethodOverloading {
    static void main(String[] args) {
        sayHello();
        sayHello("bachtiar");
        sayHello("bachtiar", "firdaus");
    }
    static void sayHello(){
        System.out.println("hello");
    }
    static void sayHello(String firstName){
        System.out.println("hello " + firstName);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("hello " +firstName + " " + lastName);
    }
}
