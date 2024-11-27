package atu.Week8;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer part1Customer = new Customer("tom", "20 jiggel lane ", "199","10000456", true);
        System.out.println("Part 1 Customer Details:");
        System.out.println(part1Customer.toString());


        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Smith");
        part2Customer.setAddress("21 jiggle lanes");
        part2Customer.setNumber("5");
        part2Customer.setField(true);
        part2Customer.setCustomer("1335800");

        System.out.println("\nPart 2 Customer Details:");
        System.out.println("Name: "+ part2Customer.getName());
        System.out.println("Address: "+ part2Customer.getAddress());
        System.out.println("Number: "+ part2Customer.getNumber());
        System.out.println("Field: "+ part2Customer.isField());
        System.out.println("Customer Details: "+part2Customer.getCustomer());



    }
    }
