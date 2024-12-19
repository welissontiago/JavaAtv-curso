package Entites;

public class Individual extends Contribuintes{
	
	private double healthcare;

	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, double healthcare) {
		super(name, annualIncome);
		this.healthcare = healthcare;
	}

	public double getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(double healthcare) {
		this.healthcare = healthcare;
	}

	@Override
	public double impostos() {
		if(super.getAnnualIncome() < 20000) {
			return super.getAnnualIncome()*0.15;
		}else if(super.getAnnualIncome() >= 20000) {
			return (super.getAnnualIncome()*0.25) - (healthcare*0.50);
		}
		return 0;
	}
	
	
	

}
