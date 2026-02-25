package generic.application;

import generic.MyData;

public class WildcardApp {
    static void main(String[] args) {

        // versi manual
        print(new MyData<Integer>(100));
        print(new MyData<String>("daus"));

        // versi automatic
        print(new MyData<>(50));
        print(new MyData<>("bachtiar"));

        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
