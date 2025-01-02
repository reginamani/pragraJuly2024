package aug27;

public class AccountDetails {
    private String accountHolderName;
    private double balance;

    public AccountDetails(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public double depositAmount(double amount){
        if(amount>0){
            balance += amount;
        }
        return balance;

    }

    public double withdrawAmount(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
        }
        else {
            System.out.println("Balance Insufficient!");
        }
        return balance;

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
