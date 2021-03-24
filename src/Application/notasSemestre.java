package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.notas;

public class notasSemestre {
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	notas not = new notas();
	
	not.name = sc.nextLine();
	not.nota1 = sc.nextDouble();
	not.nota2 = sc.nextDouble();
	not.nota3 = sc.nextDouble();
	
	System.out.println("Final grade : " + not.notaFinal());
	
	if (not.notaFinal() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING " + String.format("%.2f", not.pontosFaltantes()) );
		}
		else {
		System.out.println("PASS");
		}
		sc.close();
	
	
	
	
	}
	
}
