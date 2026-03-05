public class ExpressShipping implements ShippingStrategy {
    public double calculate(double weightKg) {
        return 80.0+(weightKg*15.0);
    }
}
