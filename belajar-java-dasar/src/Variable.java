public class Variable {
    static void main(String[] args) {
        String name;
        name = "Bachtiar Firdaus";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "daus";
        System.out.println(name);


        // kata kunci var
//         var newName; // error
//        newName = "daus";

        var newAge = 30;
        var newAddress = "Indonesia";
//        System.out.println(newName);
        System.out.println(newAge);
        System.out.println(newAddress);

        // constant / final data tidak bisa di ubah
        final String application = "Belajar Java";
//        application = "Belajar PHP" // error
        System.out.println(application);

    }
}
