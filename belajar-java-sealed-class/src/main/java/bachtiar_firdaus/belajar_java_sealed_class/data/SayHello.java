package bachtiar_firdaus.belajar_java_sealed_class.data;

public sealed interface SayHello permits Human, Dog, Cat{

    String hello();
}
