package belajar_java_validation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Person {

    @Size(max = 20, message = "first name length max must 20 characters")
    @NotBlank(message = "first name can't blank")
    private String firstName;

    @Size(max = 20, message = "last name length max must 20 characters")
    @NotBlank(message = "last name can't blank")
    private String lastName;

    @NotNull(message = "address can't null")
    @Valid
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    public void sayHello(@NotBlank(message = "name can not blank") String name) {
        System.out.println("Hello " + name + ", my name is " + firstName);
    }

    @NotBlank(message = "full name can not blank")
    public String fullName() {
        return firstName + " " + lastName;
    }
}
