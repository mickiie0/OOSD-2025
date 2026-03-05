class main
{
    public static void main(String[] args) {
        double weight = 3.0;
        ShippingCalculator s = new ShippingCalculator();
        s.setStrategy(new StandardShipping());
        System.out.println("ค่าจัดส่ง = "+s.calculateFee(weight));
        s.setStrategy(new ExpressShipping());
        System.out.println("ค่าจัดส่ง = "+s.calculateFee(weight));
        s.setStrategy(new PickupShipping());
        System.out.println("ค่าจัดส่ง = "+s.calculateFee(weight));
    }
}
