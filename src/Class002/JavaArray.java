package Class002;
import java.util.Scanner;
public class JavaArray {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ask for the user's first name
                System.out.println("can you please enter your first name: ");
                String firstName = scanner.nextLine();

                // Ask for the user's date of birth
                System.out.print("Please enter your date of birth (DD-MM-YYYY): ");
                String dateOfBirth = scanner.nextLine();

                // Display the entered information
                System.out.println("Greate, " + firstName + "! You were born on " + dateOfBirth);
                System.out.println("Greate, " + firstName + "! You were born on " + dateOfBirth);
                System.out.println("Greate, " + firstName + "! You were born on " + dateOfBirth);
                System.out.println("Greate, " + firstName + "! You were born on " + dateOfBirth);
                System.out.println("Greate, " + firstName + "! You were born on " + dateOfBirth);
                System.out.println("Greate, " + firstName + "! You were born on " + dateOfBirth);


                // Close the scanner
                scanner.close();
            }

}

