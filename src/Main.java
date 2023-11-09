import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

            final int AGE;

            AGE = 25;

            System.out.println(
                    Roles.MAGE.description +
                            Roles.WARRIOR.description
            );








            Scanner sc = new Scanner(System.in);

            // Variables
            String myRegex = "^(?=.*[0-9]).*(?=.*[a-z]){2}.*$";   // TODO - UTF?

            while (true) {
                System.out.println("Type something!");
                System.out.println("Regex is: " + myRegex);

                boolean doesMatch = Pattern.matches(myRegex, sc.nextLine());

                if (doesMatch) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILURE");
                }

            }

        }
    }

