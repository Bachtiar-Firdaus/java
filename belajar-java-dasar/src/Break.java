public class Break {
    static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke- " + counter);
            counter++;
            if(counter > 10){
                break;
            }
        }

        for (int c = 1; c <= 10; c++){
            if (c % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil - " + c);
        }
    }
}
