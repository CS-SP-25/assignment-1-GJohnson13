class FourPointFivePercent implements SalesTaxBehavior {
    @Override
    public double compute(Double value) {return value * .045;}
}
