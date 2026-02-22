import java.util.Scanner;
/**
 * This ProgramChallenge 12 and it does the following:
 * 1)allows you to input your city name
 * 2)allows you to know how many characters the city has
 * 3)it upper cases your city
 * 4)it lower cases your city
 * 5)it gives the first letter of the city
 * @author Gerardo Vasquez, gerardovasquezac3@gmail.com
 * @version v1.0
 * @since 02/21/26
 */
public class ProgChall12
 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a city: ");
        String city = keyboard.nextLine();

        System.out.println();

        System.out.println("The city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));
    }
}
