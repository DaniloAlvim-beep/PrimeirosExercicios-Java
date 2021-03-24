package Application;

import java.util.Scanner;

import Entities.Rectangle;

public class problemRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle recc = new Rectangle();
		
		System.out.println("Enter rectangle width and height : ");
		recc.width = sc.nextDouble();
		recc.height = sc.nextDouble();
		
		System.out.println("Area = " + recc.area());
		System.out.println("Perimeter = " + recc.perimeter());
		System.out.println("Diagonal = " + recc.diagonal());
		
		sc.close();
	}

}
