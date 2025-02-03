public class Alaska extends State {
    public Alaska() {
        this.setName("Alaska");
        this.taxBehavior = new NoTax();
    }
    //Printing and determining results of Alaska Tax
    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in Alaska is $%.2f (No sales tax).%n", value, tax);
    }
}