package generic.application;

import generic.MyData;

public class GenericClassApp {
    static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("daus");
        MyData<Integer> integerMyData = new MyData<Integer>(1000);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
