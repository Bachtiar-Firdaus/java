package belajar.pakage.data;

class SocialMedia {
    String name;
}

class  Facebook extends SocialMedia{
    final void login(String username, String password){
        // isi method
    }
}

class FakeFacebook extends Facebook{
    // Error
//    void login(String username, String password){
//        // isi method
//    }
}
