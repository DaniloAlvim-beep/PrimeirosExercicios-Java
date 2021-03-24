package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.employee;

public class enployeer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		employee emp = new employee();
		
		
		
		
		System.out.print("Employee : ");
		emp.name = sc.nextLine();
		System.out.print("Gross salaty : ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax : ");
		emp.tax = sc.nextDouble();
		
		
		
		System.out.println();
		System.out.println("Wich percentage to encrease in salary : ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data : " + emp.toString());
		
		sc.close();
		
	}

}
