import java.util.Scanner;
/**
 * This is Program Challenge 2 and does the following:
 * 1) It allows me to enter my first name
 * 2) It allows me to enter my middle name
 * 3) It allows me to enter my last name
 * 4) And finally it allows me give me my full name and my initials 
 * @author Gerardo Vasquez, gerardovasquezac3@gmail.com
 * @version v1.0
 * @since 02/21/26
 */

public class ProgChall2
 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = keyboard.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();
        
        System.out.println();

        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);

        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);
    }
}



