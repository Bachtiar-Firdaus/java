package generic.application;

import generic.MyData;

public class TypeErasureApp {
    static void main(String[] args) {


        // type erasure
        MyData myData = new MyData("Eko");

        // type normal
//        MyData<String> myData = new MyData<String>("Eko");

        // warning penggunaan type erasure rawan error hiden
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();


    }
}
