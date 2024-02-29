import java.util.Scanner;

public class ChangeMaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your amount in dollars: ");
        int dollars = scanner.nextInt();
        System.out.print("Please enter your amount in cents: ");
        int cents = scanner.nextInt();

        int totalCents = (dollars * 100) + cents;
        int quarters = totalCents / 25;
        int remainingCentsAfterQuarters = totalCents % 25;
        int dimes = remainingCentsAfterQuarters / 10;
        int remainingCentsAfterDimes = remainingCentsAfterQuarters % 10;
        int nickels = remainingCentsAfterDimes / 5;
        int pennies = remainingCentsAfterDimes % 5;

        System.out.println(dollars + " dollars and " + cents + " cents are:");
        System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels
                + " nickels, and " + pennies + " pennies.");

        scanner.close();
    }
}
