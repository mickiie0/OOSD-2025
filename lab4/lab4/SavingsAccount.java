public class SavingsAccount extends Account {
    SavingsAccount(String n,String id,double b){
        super(n, id, b);
    }

    @Override
    public double withdraw(double b) {
        return balance;
    }

    public void printData() {
        System.out.println(acc_name);
        System.out.println(acc_id);
        System.out.println(balance % .2f);
    }
}
