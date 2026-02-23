package belajar.pakage.data;

class SocialMedia {
    String name;
}

//ini karna final jadi ga bisa ada turunan baru
final class  Facebook extends SocialMedia{

}

//class FakeFacebook extends Facebook{ ini akan error karna Facebook sudah final
//}
