package Entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double Tax() {
		// TODO Auto-generated method stub
		double sum = 0;
		if(getAnnualIncome() <= 20000.00) {
			sum += getAnnualIncome() * 0.15;
		}
		else {
			sum += getAnnualIncome() * 0.25;
		}
			sum -= (getHealthExpenditures() * 0.5);
		return sum;
	}

}
