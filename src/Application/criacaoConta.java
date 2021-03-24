package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.banco;

public class criacaoConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		banco bc;
		
		System.out.print("Enter account number : ");
		int number = sc.nextInt();
		System.out.print("Enter account holder : ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n) : ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value : ");
			double initialDeposit = sc.nextDouble();
			bc = new banco(number, holder, initialDeposit);
		}
		
		else {
			bc = new banco(number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data : ");
		System.out.println(bc.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value : ");
		double depositAdd = sc.nextDouble();
		bc.deposit(depositAdd);
		
		System.out.println("Updated account data :" + bc.toString());
		
		System.out.print("Enter a withdraw value : ");
		double remove = sc.nextDouble();
		bc.withdraw(remove);
		
		System.out.println("Updated account data :" + bc.toString());
		
		
		
		sc.close();
		
		
		

	}

}
