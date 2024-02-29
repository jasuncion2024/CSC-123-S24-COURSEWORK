import java.util.Scanner;

public class CoinCounter {

	private int quarters;
	private int dimes;
	private int nickles;
	private int pennies;
	
	public CoinCounter(int quarters, int dimes, int nickles, int pennies) {
		this.quarters=quarters;
		this.dimes=dimes;
		this.nickles=nickles;
		this.pennies=pennies;
}
	public int getDollarAmount () {
		int totalCents = (pennies * 1) + (nickles * 5) + (dimes * 10) + (quarters * 25);
		return totalCents / 100;
	}
	
	public int getCentsAmount () {
		int totalCents = (pennies * 1) + (nickles * 5) + (dimes * 10) + (quarters * 25);
		return totalCents % 100;
	}
	
	public void main () {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of pennies: ");
        int pennies = scanner.nextInt();
        System.out.print("Please enter the number of nickels: ");
        int nickels = scanner.nextInt();
        System.out.print("Please enter the number of dimes: ");
        int dimes = scanner.nextInt();
        System.out.print("Please enter the number of quarters: ");
        int quarters = scanner.nextInt();
        
        CoinCounter coinCounter = new CoinCounter(quarters, dimes, nickles, pennies);
        
        System.out.println("You have " + coinCounter.getDollarAmount() + " dollars and " +
                coinCounter.getCentsAmount() + " cents.");
	}
}
	
