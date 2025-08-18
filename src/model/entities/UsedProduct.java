package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product3 {

	private LocalDate  manufactureDate;

	//constructors
	public UsedProduct(String name, double price, LocalDate  manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	//getters e setters
	public LocalDate  getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate  manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	//métodos
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
				
	}
	
	
	
}
