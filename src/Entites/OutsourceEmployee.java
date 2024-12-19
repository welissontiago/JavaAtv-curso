package Entites;

public class OutsourceEmployee extends Employee{
	
	private double additionalCharge;
	
	public OutsourceEmployee() {
	}

	public OutsourceEmployee(String name, Integer hour, Double valuePerHour, double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final double payment() {
		return super.payment() + additionalCharge*1.1;
	}
	

}
