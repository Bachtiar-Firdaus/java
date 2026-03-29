package bachtiar_firdaus.belajar_java_sealed_class.data;

public record Human() implements SayHello {
    @Override
    public String hello() {
        return "hello";
    }
}
