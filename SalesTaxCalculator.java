import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the state name (Indiana, Alaska, or Hawaii) followed by the sale amount:");

        String input = scanner.nextLine();

        // Split the input into state name and sale amount
        String[] parts = input.split(" ");
        if (parts.length != 2) {
            System.out.println("Enter 'Indiana', 'Alaska', or 'Hawaii' followed by the sale amount, separated by a space.");
            scanner.close();
            return;
        }

        String stateName = parts[0];
        double saleAmount;

        // Ensure the second input is a valid number
        try {
            saleAmount = Double.parseDouble(parts[1]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid numeric sale amount.");
            scanner.close();
            return;
        }

        // Determine the state and assign the correct tax behavior
        State state;
        switch (stateName.toLowerCase()) {
            case "indiana":
                state = new Indiana();
                break;
            case "alaska":
                state = new Alaska();
                break;
            case "hawaii":
                state = new Hawaii();
                break;
            default:
                System.out.println("Enter 'Indiana', 'Alaska', or 'Hawaii'.");
                scanner.close();
                return;
        }

        // Display the tax calculation
        state.showTax(saleAmount);

        // Close the scanner
        scanner.close();
    }
}
