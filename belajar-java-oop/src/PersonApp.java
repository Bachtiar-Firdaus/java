public class PersonApp {
    static void main(String[] args) {

        // menggunakan new untuk membuat object
        var person1 = new Person();
        person1.name = "Bachtiar";
        person1.address = "Lampung";
//        person1.country = "Amerika"; // Error
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);


        Person person2 = new Person();
        Person person3;
        person3 = new Person();

    }
}
