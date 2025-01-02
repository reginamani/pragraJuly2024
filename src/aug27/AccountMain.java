package aug27;

public class AccountMain {
    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails("Regina",5000);

        System.out.println("Intial Balance: "+accountDetails.getBalance());
        accountDetails.depositAmount(1000);
        System.out.println("Balance after deposit: "+accountDetails.getBalance());

        accountDetails.withdrawAmount(500);
        System.out.println("Balance after withdraw: "+accountDetails.getBalance());
    }
}
