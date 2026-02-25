package generic.application;

import generic.MyData;

public class ContravariantApp {
    static void main(String[] args) {

        MyData<Object> objectMydata = new MyData<>("daus");
//        hati hati penggunaan contravariant
        objectMydata.setData(1000);

        MyData<? super String> myData = objectMydata;

        process(objectMydata);

        System.out.println(objectMydata.getData());
    }

    public static void process(MyData<? super  String> myData){
//        String val = (String) myData.getData(); // error
        Object val = myData.getData();
        System.out.println("Proses Parameter "+ val);

        myData.setData("bachtiar");
    }
}
