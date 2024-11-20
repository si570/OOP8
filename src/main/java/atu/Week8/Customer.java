package atu.Week8;

public class Customer extends Person {
    private String customer;
    private boolean field;

    @Override
    public String toString() {
        return "Customer{" +
                "customer='" + customer + '\'' +
                ", field=" + field +
                '}';
    }

    public Customer(String name, String address, int number, boolean field, String customer) {
        super(name, address, number);
        this.field = field;
        this.customer = customer;
    }

    public Customer(boolean field, String customer) {
        this.field = field;
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public boolean isField() {
        return field;
    }

    public void setField(boolean field) {
        this.field = field;
    }
}
