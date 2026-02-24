package generic.application;

import generic.MyData;

public class InvariantApp {
    static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("daus");
//        doIt(stringMyData); // ERROR
//        MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData; // ERROR

//        doItInteger(objectMyData); // ERROR


    }

    public static void  doIt(MyData<Object> objectMyData){

    }

    public static void  doItInteger(MyData<Integer> integerMyData){

    }
}
