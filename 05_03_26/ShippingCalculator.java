class ShippingCalculator
{
    private ShippingStrategy strategy;

    void setStrategy(ShippingStrategy i){
        strategy = i;
    }

    double calculateFee(double weightKg){
        if (strategy == null) {
            return 0;
        }
        return strategy.calculate(weightKg);
    }
}
