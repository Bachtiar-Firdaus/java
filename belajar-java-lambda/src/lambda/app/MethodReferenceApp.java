package lambda.app;

import lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    static void main(String[] args) {

        // static
//        Predicate<String> predicateIsLowerCase = s -> StringUtil.isLowerCase(s);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("dauAs"));
        System.out.println(predicateIsLowerCase.test("daus"));

//        Function<String, String> functionUpperr = s -> s.toUpperCase();
        Function<String, String> functionUpperr = String::toUpperCase;
        System.out.println(functionUpperr.apply("daus"));
    }

    // method object diri sendiri
    public void run(){
        Predicate<String> predicateIsLowerCase = this::isLowerCase;
        System.out.println(predicateIsLowerCase.test("dauAs"));
        System.out.println(predicateIsLowerCase.test("daus"));
    }

    // method object orang lain
    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;
        System.out.println(predicateIsLowerCase.test("dauAs"));
        System.out.println(predicateIsLowerCase.test("daus"));
    }

    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
