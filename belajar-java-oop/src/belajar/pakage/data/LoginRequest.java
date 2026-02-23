package belajar.pakage.data;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Membuat Object Login Request");
    }

    // constructor overloading
    public LoginRequest(String username){
        this(username, "");
    }
    public LoginRequest(){
        this("","");
    }
}
