import java.util.Scanner;

/**
 * This is Program Challenge 15 and does the following:
 * 1) Asks for the number of shares purchased
 * 2) Asks for the price per share
 * 3) Calculates and displays total cost of shares, commission, and total bill
 * @author Gerardo Vasquez, gerardovasquezac3@gmail.com
 * @version v1.0
 * @since 02/22/26
 */
public class ProgChall15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        final double COMMISSION_RATE = 0.02;

        System.out.print("Enter number of shares purchased: ");
        int shares = keyboard.nextInt();

        System.out.print("Enter price per share: $");
        double pricePerShare = keyboard.nextDouble();
        
        System.out.println();

        double stockCost = shares * pricePerShare;
        double commissionAmt = stockCost * COMMISSION_RATE;
        double totalCost = stockCost + commissionAmt;

        System.out.printf("Total cost of shares are: $%,.2f\n", stockCost);
        System.out.printf("Commission cost is: $%,.2f\n", commissionAmt);
        System.out.printf("Total Cost is: $%,.2f\n", totalCost);
    }
}
