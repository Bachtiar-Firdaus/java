package classes;

public class StringApp {
    static void main(String[] args) {
        String name = "Bachtiar Firdaus";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);

        System.out.println(name.length());
        System.out.println(name.startsWith("Bach"));
        System.out.println(name.endsWith("daus"));

        String[] names = name.split(" ");
        System.out.println(names[0]);
        for (var x : names){
            System.out.println(x);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
    }
}
