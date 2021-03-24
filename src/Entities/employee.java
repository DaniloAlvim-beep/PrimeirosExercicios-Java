package Entities;

public class employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percent) {
		return grossSalary += grossSalary * percent / 100.0;
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
		
	}
}


