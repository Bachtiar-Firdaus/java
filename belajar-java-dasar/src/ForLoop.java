public class ForLoop {
    static void main(String[] args) {
        /* hati hari dead lock
        for(;;){
            System.out.println("perulangan");
        }*/

        var counter = 1;

        for(;counter <=3;){
            System.out.println("perulangan " + counter);
            counter++;
        }

        // versi init statement
        for(var i = 1; i <=3;){
            System.out.println("perulangan init statement" + i);
            i++;
        }

        // versi post statement
        for(var i = 1; i <=3; i++){
            System.out.println("perulangan post statement" + i);
        }
    }
}
