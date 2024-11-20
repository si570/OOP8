package atu.Week8;

public class Person {
    private String name;
    private String address;
    private int number;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public Person(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Person() {
        name="";
        address="";
        number=0;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
