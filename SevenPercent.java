public class SevenPercent implements SalesTaxBehavior {
    //For states with a Tax use this method
    @Override
    public double compute(Double value) {
        return value * 0.07;
    }
}