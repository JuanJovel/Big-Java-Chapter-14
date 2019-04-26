
// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the amount of sales people: ");
		final int SALESPEOPLE = keyboard.nextInt();
		int[] sales = new int[SALESPEOPLE];
		int sum;

		for (int i = 0; i < sales.length; i++) {
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = keyboard.nextInt();
		}

		System.out.println("\nSalesperson   Sales");
		System.out.println("--------------------");
		sum = 0;
		int maxSale = sales[0];
		int minSale = sales[0];
		for (int i = 0; i < sales.length; i++) {
			System.out.println("     " + (i+1) + "         " + sales[i]);
			sum += sales[i];
			maxSale = Math.max(sales[i], maxSale);
			minSale = Math.min(sales[i], minSale);
		}
		
		double averageSale = sum/SALESPEOPLE;

		System.out.println("\nAverage sale: " +averageSale);
		System.out.println("\nMaximum sale: " +maxSale);
		System.out.println("\nTotal sales: " + sum);
		
		keyboard.close();
	}
}
