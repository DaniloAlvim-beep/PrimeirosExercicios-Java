package Entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}



	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}



	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}



	@Override
	public double Tax() {
		// TODO Auto-generated method stub
		double sum = 0;
		if(getNumberOfEmployees() > 10) {
			return sum += getAnnualIncome() * 0.14;
		}
		else {
			return sum += getAnnualIncome() * 0.16;
		}
	}

}
