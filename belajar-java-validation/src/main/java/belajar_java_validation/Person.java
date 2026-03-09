package belajar_java_validation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Person {

    private List<@NotBlank(message = "hobby can not blank") String> hobbies;

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

    @Valid
    public Person(@NotBlank(message = "first name can not blank") String firstName,
                  @NotBlank(message = "last name can not blank") String lastName,
                  @NotNull(message = "address can not null") @Valid Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Valid
    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
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
