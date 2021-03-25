package ncku.unclethree;

public class Account {
    private double balance;
    private String customerName, customerEmail, number, customerPhoneNumber;

    public Account() {
        this("Default Name", "Default Email", "Default Bank Number", "Default Phone Number", 0);
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String customerEmail, String number, String customerPhoneNumber, double balance) {
        setNumber(number);
        setBalance(balance);
        setCustomerEmail(customerEmail);
        setCustomerName(customerName);
        setCustomerPhoneNumber(customerPhoneNumber);
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this(customerName, customerEmail, "0", customerPhoneNumber, 0);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Value");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " processed, remaining balance is " + this.balance);
        } else {
            System.out.println("Deposit of " + amount + " not processed, remaining balance is " + this.balance);
        }
    }


    public void withdrawal(double amount) {
        if (amount > 0 && this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed, remaining balance is " + this.balance);
        } else {
            System.out.println("Withdrawal of " + amount + " not processed, remaining balance is " + this.balance);
        }
    }
}