package model.entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double tax = 0.0;
		if (super.getAnualIncome() < 20000) {
			tax = (super.getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.50);
		}
		else {
			tax = (super.getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.50);
		}
		return tax;
	}
	
}
