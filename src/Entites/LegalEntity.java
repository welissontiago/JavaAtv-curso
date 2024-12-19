package Entites;

public class LegalEntity extends Contribuintes{
	
	private Integer employees;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double impostos() {
		if(employees > 10) {
			return super.getAnnualIncome()*0.14;
		}
		return super.getAnnualIncome()*0.16;
	}
}
