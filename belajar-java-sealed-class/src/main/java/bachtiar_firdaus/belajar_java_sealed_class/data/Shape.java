package bachtiar_firdaus.belajar_java_sealed_class.data;

public sealed interface Shape permits Circle, Rectangle, Triangle{

    Long area();
}
