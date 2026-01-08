public class Account {
     String acc_name;
     String acc_id;
     double balance;

    Account() {
    }

    Account(String n, String id, double b) {
        acc_name = n;
        acc_id = id;
        balance = b;
    }

    public double withdraw(double b) {
        if((balance-b) < 0){

        }else{
            balance-=b;
        }
        return balance;
    }
}
