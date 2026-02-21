public class Scope {
    static void main(String[] args) {
        sayHello("daus");
        sayHello("");
    }
    static void sayHello(String name){
        String hello = "Hello "+name;
        if(!name.isBlank()){
            String hi = "Hi "+ name;
            System.out.println(hi);
        }
        System.out.println(hello);
//        System.out.println(hi); hi tidak bisa di akses dari luar block ini yang dinamakan scope

    }
}
