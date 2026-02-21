public class RecursiveMethod {
    static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(1*2*3*4*5);
        System.out.println(factorialRecursive(5));
        loop(1000); // lebih dari 4000 kena stackoverflow

    }
    static int factorialLoop(int value){
        var result = 1;
        for (var con = 1; con <= value; con++){
            result *= con;
        }
        return result;
    }

    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorialRecursive(value-1);
        }
    }

    // sample stackoverflocw hati hati dalam penggunaan recursive
    static void loop(int value){
        if(value == 0){
            System.out.println("selesai");
        }else{
            System.out.println("Loop "+ value);
            loop(value - 1);
        }
    }

}
