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

    // proses pengecekan dan konversi
    // type check and cast
    static void sayHello(Employee employee){
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello " + vicePresident.name);
        }else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }

    }
}
