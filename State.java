public abstract class State {
    private String name;
    protected SalesTaxBehavior taxBehavior;

    //Setting tool for others to name the state
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Basic ShowTax statement
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax);
    }
}
