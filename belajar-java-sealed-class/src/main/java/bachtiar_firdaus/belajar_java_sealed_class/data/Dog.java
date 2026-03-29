package bachtiar_firdaus.belajar_java_sealed_class.data;

public record Dog() implements SayHello {
    @Override
    public String hello() {
        return "guk";
    }
}
