public class ForEach {
    static void main(String[] args) {
        String[] array = {
                "daus", "bach", "tia",
                "firda", "bachtiar", "fridaus"
        };

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("FOUR EACH");
        for(var newArray: array){
            System.out.println(newArray);
        }
    }
}
