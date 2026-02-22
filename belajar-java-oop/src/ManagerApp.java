public class ManagerApp {
    static void main(String[] args) {
        var manager = new Manager("bachtiar");
        manager.sayHello("daus");

        // sample inheritance atau pewarisah dari induk ke child
        var vp = new VicePresident("Firdaus");
        vp.sayHello("Budi");
    }
}
