public class MainBankAccount
{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("001","A",1500);
        b1.deposit(200);
        b1.withdraw(100);
        b1.printInfo();
    }
}
