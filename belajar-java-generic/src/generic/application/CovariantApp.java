package generic.application;

import generic.MyData;

public class CovariantApp {
    static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("daus");

        process(stringMyData);

        // model 1
        MyData<? extends Object> myData = stringMyData;
    }

    // model 2
    public static void process(MyData<? extends Object> myData){
        // covariant strict atau terbatas hanya untuk ngambil data
        // tidak bisa set data

        System.out.println(myData.getData());
//        myData.setData("daus"); // ini tidak bisa
    }
}
