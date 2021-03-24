package util;

public class currencyConverter {
		
	
	public static final double IOF = 6.0;
	
	public static double tax(double dollarBought, double dollarPrice) {
		double valor = dollarBought * dollarPrice;
		return valor += valor * IOF /100;
	}
	
	
	
	
	}

