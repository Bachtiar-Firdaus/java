package bachtiar_firdaus.belajar_java_sealed_class.data;

public non-sealed class Manager extends Employee{

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
