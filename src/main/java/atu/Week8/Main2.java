package atu.Week8;

public class Main2 {
    public static void main(String[] args) {
        PreferredCustomer preferredCustomer2 = new PreferredCustomer();
        preferredCustomer2.setName("Paul");
        preferredCustomer2.setAddress("ATU");
        preferredCustomer2.setNumber("091 775678");
        preferredCustomer2.setCustomer("1002");
        preferredCustomer2.setField(false);
        preferredCustomer2.setLoyaltyPoints(700); // Accumulate points
        System.out.println(preferredCustomer2);
        preferredCustomer2.setLoyaltyPoints(800); // Accumulate more points
        System.out.println(preferredCustomer2);

    }
}
