class FourPointFivePercent implements SalesTaxBehavior {
    //Tax method for Hawaii or states with 4.5% Tax
    @Override
    public double compute(Double value) {return value * .045;}
}
