public class Indiana extends State {
    public Indiana() {
        this.setName("Indiana");
        this.taxBehavior = new SevenPercent();
    }
    //Printing and determining results of Indiana Tax
    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in Indiana is $%.2f (7%% sales tax).%n", value, tax);
    }
}