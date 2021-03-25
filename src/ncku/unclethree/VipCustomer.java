package ncku.unclethree;

public class VipCustomer {
    private String name, email;
    private double creditLimit;

    public VipCustomer() {
        this("Default Name", "Default Email", 0);
    }

    public VipCustomer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String email) {
        this(name, email, 0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}