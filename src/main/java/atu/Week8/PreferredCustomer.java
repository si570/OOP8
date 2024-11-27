package atu.Week8;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer(String name, String address, String number, boolean field, String customer, int loyaltyPoints, double discountLevel) {
        super(name, address, number,customer, field);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public PreferredCustomer() {
        super();
        discountLevel = 0.0;
        loyaltyPoints = 0;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return "PeferedCustomer{" +
                "loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '%';
    }

    public void addloyaltyPoints(int points) {
        loyaltyPoints += points;

    }
    public void setDiscountLevel(){
        if(loyaltyPoints >= 500){
            discountLevel =5;
        }
        if(loyaltyPoints >= 1000){
            discountLevel =6;
        }
        if(loyaltyPoints >= 1500){
            discountLevel =7;
        }
        if(loyaltyPoints >= 2000){
            discountLevel =10;
        }
    }
}
