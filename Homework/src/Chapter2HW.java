import java.util.Scanner;
public class Chapter2HW {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		// Part 1 (Fuel Efficiency)
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesmpg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double gallon = input.nextDouble();
		System.out.println("The cost of driving is: " + (distance / milesmpg) * gallon);
		
		// Part 2 (Initial Investment)
		
		System.out.print("Enter initial investment: ");
		double investment = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate = input.nextDouble() / 1200;
		System.out.print("Enter number of years: ");
		short years = input.nextShort();
		System.out.println("Future value is $" + investment * Math.pow(1 + interestRate, years * 12));
	}
}
