import java.util.Scanner;
/**
 * This is Program Challenge 13 and it does the following
 * 1)You imput the meal price
 * 2)It calculates teh taxrate multplied by the meal amount to obtain 
 * the tax amount
 * 3) it multiplies the meal amount times the tip rate to give you the tip 
 * amount
 * 4) In turn it gives you total price of the meal, tip and tax combined
 * @author Gerardo Vasquez, gerardovasquezac3@gmail.com
 * @version v1.0
 * @since 2/21/26
 */

public class ProgChall13
 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        final double TAX_RATE = 0.0675; 
        final double TIP_RATE = 0.20;

        System.out.print("Enter meal amount: $");
        double mealAmount = keyboard.nextDouble();
        System.out.println();

        double taxAmount = mealAmount * TAX_RATE;
        
        double tipAmount = mealAmount * TIP_RATE; 
        double totalBill = mealAmount + taxAmount + tipAmount;

       
        System.out.printf("The tax is: $%,.2f\n", taxAmount);
        System.out.printf("The tip is: $%,.2f\n", tipAmount);
        System.out.printf("The meal cost with tax and tip is: $%,.2f\n", totalBill);
    }
}

