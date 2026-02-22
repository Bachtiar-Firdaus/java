package belajar.pakage.data;

public class ProductApp {
    static void main(String[] args) {
        Product product = new Product("Lenove Legion 71", 36_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);
    }
}
