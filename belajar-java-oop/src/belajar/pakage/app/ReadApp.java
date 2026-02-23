package belajar.pakage.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//public class ReadApp {
//    static void main(String[] args) {
//        BufferedReader reader = null;
//
//        try{
//            reader = new BufferedReader(
//                    new FileReader("daus.md")
//            );
//
//            while (true){
//                String line = reader.readLine();
//                if(line == null){
//                    break;
//                }
//                System.out.println(line);
//            }
//
//        } catch (Throwable throwable) {
//            System.out.println("Error Membaca File "+ throwable.getMessage());
//        } finally {
//            if(reader != null){
//                try{
//                    reader.close();
//                    System.out.println("sukses menutup");
//                } catch (IOException exception) {
//                    System.out.println("Error menutup resource "+ exception.getMessage());
//                }
//
//            }
//        }
//    }
//}
public class ReadApp {
    static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("daus.md"))){

            while (true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error Membaca File "+ throwable.getMessage());
        }
    }
}