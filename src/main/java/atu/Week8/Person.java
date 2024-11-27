package atu.Week8;

public class Person {
    private String name;
    private String address;
    private String number;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public Person(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Person() {
        name="";
        address="";
        number="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
