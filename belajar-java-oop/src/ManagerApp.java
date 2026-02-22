public class ManagerApp {
    static void main(String[] args) {
        var manager = new Manager();
        manager.name = "bachtiar";
        manager.sayHello("daus");

        // sample inheritance atau pewarisah dari induk ke child
        var vp = new VicePresident();
        vp.name = "Firdaus";
        vp.sayHello("Budi");
    }
}
