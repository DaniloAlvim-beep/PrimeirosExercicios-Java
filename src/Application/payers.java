package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

public class payers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Tax payer #" + (i+1) + "data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tax : list) {
			System.out.println(String.format("%.2f", tax.Tax()));
		}
		sc.close();
	}

}
