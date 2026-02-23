package classes;

public class StringBuilderApp {
    static void main(String[] args) {

        // ini tidak di rekomendasikan karna berdampak pada memory
        String name = "Bach";
        name = name + "tiar";
        name = name + " " + "Firdaus";

        System.out.println(name);

        // yang di rekomendasikan untuk performa
        StringBuilder builder = new StringBuilder();
        builder.append("bach");
        builder.append("tiar");
        builder.append(" ");
        builder.append("firdaus");

        String nameBuilder = builder.toString();
        System.out.println(nameBuilder);
    }
}
