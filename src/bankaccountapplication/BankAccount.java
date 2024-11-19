package bankaccountapplication;

public class BankAccount {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int accountID;
    private Double balance;
    
// Set initial Account Value to 0
    public BankAccount() {
        balance = 0.00;
    }
    
// Setters and Getters

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUserName() {
        return username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;

    }
    
    public double getBalance() {
        return balance;

    }
    
    // Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    

    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Username: " + username);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);

    }
 @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %s, %f", getAccountID(), getUserName(),getFirstName(), getLastName(), getPassword(), getBalance()); // Hash password before saving
  }
}




