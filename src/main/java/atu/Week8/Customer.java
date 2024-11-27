package atu.Week8;

public class Customer extends Person {
    private String customer;
    private boolean field;

    @Override
    public String toString() {
        return super.toString()+" " +
                "customer='" + customer + '\'' +
                ", field=" + field +
                '}';
    }

    public Customer(String name, String address, String number, String customer, boolean field) {
        super(name, address, number);
        this.customer = customer;
        this.field = field;
    }

    public Customer() {
        super();
        field = false;
        customer = "";
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
