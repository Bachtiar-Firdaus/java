public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor digunakan untuk memaksa mengirimkan value ketika menggunakan object
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName){
        // memanggil constructor lain
        this(paramName, null);
    }


    Person(){
    }


    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + ", My name is "+ name);
    }

    // sample parameter shadowing
    void sayShadow(String name){
        // karna nama variable sama mengakibatkan akses varible terbatas pada block terdekat
        System.out.println("Hello "+ name + ", My name is "+ name);
    }
}
