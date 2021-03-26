package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.FuncionarioTerceirizado;
import Entities.Funcionarios;

public class folhaDePagamento {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #" +(i+1 + " data: "));
			System.out.print("Outsourced (y/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours : ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge : ");
				double additionalCharge = sc.nextDouble();
				
				FuncionarioTerceirizado emp = new FuncionarioTerceirizado(name, hours,
						valuePerHour, additionalCharge);
				list.add(emp);	
			}
			else {
				Funcionarios emp = new Funcionarios(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("Payment : ");
		for(Funcionarios emp : list) {
			System.out.println(emp.getName() + ", $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}
