package Entites;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends ProductPolimorfado{
	
	private Date manufacturedDate;

	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public UsedProduct() {
		super();
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    return name + " $ " + price + " (Manufacture date: " + sdf.format(manufacturedDate) + ")";
	}

}
