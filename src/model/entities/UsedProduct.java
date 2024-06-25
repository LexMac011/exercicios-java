package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product1{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return getName() + " (used) $" + String.format("%.2f ", getPrice()) + "(Manufacture date: " +sdf.format(manufactureDate) + ")";
	}
	
}
