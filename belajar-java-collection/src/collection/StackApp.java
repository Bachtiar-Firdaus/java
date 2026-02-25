package collection;

import java.util.Stack;

public class StackApp {
    static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("daus");
        stack.push("ade");
        stack.push("ega");

        for (var val = stack.pop(); val != null; val = stack.pop()){
            System.out.println(val);
        }


    }
}
