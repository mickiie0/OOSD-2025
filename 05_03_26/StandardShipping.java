public class StandardShipping implements ShippingStrategy {
    public double calculate(double weightKg) {
        return 40.0+(weightKg*10.0);
    }
}
