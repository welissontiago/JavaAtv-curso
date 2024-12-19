package Entites;

public class ImportedProduct extends ProductPolimorfado{
	
	private Double customsfee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsfee) {
		super(name, price);
		this.customsfee = customsfee;
	}

	public Double getCustomsfee() {
		return customsfee;
	}

	public void setCustomsfee(Double customsfee) {
		this.customsfee = customsfee;
	}
	
	
	
	private double totalprice() {
		return price + customsfee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + totalprice() + "(custom fee: $ " +customsfee+")";
	}

}
