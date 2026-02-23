package belajar.pakage.app;

import belajar.pakage.data.HelloWorld;

public class HelloWorldApp {
    static void main(String[] args) {

        // ini namanya anonymouse class
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello "+ name);
            }
        };

        // ini namanya anonymouse class
        HelloWorld indonesia = new HelloWorld() {

            public void sayHello() {
                System.out.println("halo");
            }

            public void sayHello(String name) {
                System.out.println("halo "+ name);
            }
        };

        // untuk menampilkan perlu dicall functionnya
        english.sayHello();
        english.sayHello("bachtiar");

        indonesia.sayHello();
        indonesia.sayHello("firdaus");

    }
}
