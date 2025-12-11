public class Customer
{
    public String name;
    public String last_name;
    public double money;
    public double interest_rate=0.001;
    private int n=1;
    Customer(){}

    Customer(String name,String last_name){
        this.name = name;
        this.last_name = last_name;
    }
 
    Customer(String name,String last_name,double money){
        this.name = name;
        this.last_name = last_name;
        this.money = money;
    }

    public void plusMoney(){
        money += (money*interest_rate);
    }

    public void computeInterest(){
        System.out.print("ปีที่"+n+" "+name+" "+last_name+" "+money+" เงินต้นรวมดอกเบี้ย ");
        plusMoney();
        n++;
        System.out.println(money);
    }
}
