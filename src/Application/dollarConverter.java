package Application;

import java.util.Locale;
import java.util.Scanner;

import util.currencyConverter;

public class dollarConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price : ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought : ");
		double dollarBought = sc.nextDouble();
		
		double currencyValue = currencyConverter.tax(dollarBought, dollarPrice);
		System.out.print("Amount to be paid in reais " + currencyValue );
		
		sc.close();
	}
	
}
