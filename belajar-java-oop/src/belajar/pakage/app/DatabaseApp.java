package belajar.pakage.app;

import belajar.pakage.error.DatabaseError;

public class DatabaseApp {
    static void main(String[] args) {
        connectDatabase("root",null);
        System.out.println("sukses");

    }
    public static void connectDatabase(String username, String password){
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
