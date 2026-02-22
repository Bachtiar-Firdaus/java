package belajar.pakage.app;

public class EqualsApp {
    static void main(String[] args) {
        String first = "Daus";
        first = first + " " + "bachtiar";
        System.out.println(first);

        String second = "Daus bachtiar";
        String thrid = "Daus bachtiar";
        System.out.println(second);
        System.out.println(thrid);

        System.out.println(first == second); // ini membandingkan memory | false
        System.out.println(first.equals(second)); // ini membandingkan value | true
        System.out.println(thrid == second); // ini jadi true karna me refer ke memory yang sama | true
    }
}
