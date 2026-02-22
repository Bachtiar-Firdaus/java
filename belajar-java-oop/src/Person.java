public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor digunakan untuk memaksa mengirimkan value ketika menggunakan object
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + ", My name is "+ name);
    }
}
