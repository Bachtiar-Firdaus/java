public class PolymorphismeApp {
    static void main(String[] args) {

        // contoh ploymorpisme perubahan bentuk yang dari employe , menjadi manager, dan vicepresident
        Employee employee = new Employee("bachtiar");
        employee.sayHello("daus");

        employee = new Manager("diki");
        employee.sayHello("daus");

        employee = new VicePresident("dayat");
        employee.sayHello("daus");


        // contoh lain penggunaan polymorpime
        sayHello(new Employee("daus"));
        sayHello(new Manager("diki"));
        sayHello(new VicePresident("dayat"));

    }
    static void sayHello(Employee employee){
        System.out.println("Hello "+ employee.name);
    }
}
