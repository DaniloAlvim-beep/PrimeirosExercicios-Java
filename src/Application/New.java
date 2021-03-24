package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class New {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangule x : ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangule y : ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.println("triangule x area: " + String.format("%.4f%n", areax));
		System.out.println("triangule y area: " + String.format("%.4f%n", areay));
		
		if (areax > areay) {
			System.out.println("Large area : X ");
		}
		else {
			System.out.println("Large area : Y ");
		}
		
		sc.close();
		}
		
		
		
		

	}

