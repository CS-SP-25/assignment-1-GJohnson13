public class Hawaii extends State{
    public Hawaii() {
        this.setName("Hawaii");
        this.taxBehavior = new FourPointFivePercent();
    }
    //Printing and determining results of Alaska Tax
    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in Hawaii is $%.2f (4.5%% sales tax).%n", value, tax);
    }
}
