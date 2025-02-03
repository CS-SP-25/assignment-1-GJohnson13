public class NoTax implements SalesTaxBehavior {
    //For states with NoTax use this method
    @Override
    public double compute(Double value) {
        return 0.0;
    }
}