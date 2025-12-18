public class BankAccount {
    private String accountName;
    private String ownerName;
    private double balance;

    BankAccount(String an,String on,double b){
        accountName = an;
        ownerName = on;
        balance = b;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid input");
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        }else if(amount==0){
            System.out.println("Invalid input");
        }else {
            balance -= amount;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void printInfo() {
        System.out.println("เลขบัญชี : " + accountName);
        System.out.println("เจ้าของบัญชี : " + ownerName);
        System.out.println("เงินคงเหลือ : " + balance);
    }

}
