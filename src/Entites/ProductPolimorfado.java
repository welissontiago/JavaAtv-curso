package Entites;

public class ProductPolimorfado {
	
	protected String name;
	protected Double price;
	
	public ProductPolimorfado() {
	}
	
	public ProductPolimorfado(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name + " $ " + price;
	}
	
	

}
