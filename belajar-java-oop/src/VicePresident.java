// cara mewariskan dengan extend target induk
class VicePresident extends Manager{
    // mendeklarasikan ulang padahal di parent sudah ada
    // ini di namakan method overidding
    void sayHello(String name){
        System.out.println("Hi "+ name + ", My Name Is VP " + this.name);
    }
}
