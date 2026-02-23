package belajar.pakage.data;

// ini outer class
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ini inerclass
    public class Employee{
        private String name;

        public String getCompany(){
            // ini untuk akses yang line 5
            return Company.this.name;
            // ini untuk akses yang line 17
//            return this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
