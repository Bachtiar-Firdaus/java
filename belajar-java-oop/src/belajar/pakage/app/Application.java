package belajar.pakage.app;

// ini untuk import seluruh import di dalam package data
import belajar.pakage.data.*;

public class Application {
    static void main(String[] args) {
        Product product = new Product("Lenove Legion 71", 36_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
