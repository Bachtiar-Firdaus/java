package belajar.pakage.app;
import belajar.pakage.data.Product;

public class Application {
    static void main(String[] args) {
        Product product = new Product("Lenove Legion 71", 36_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
