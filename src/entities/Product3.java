package entities;

public class Product3 {

	private String name;
	private double price;
	
	//constructors
	public Product3(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//métodos
	public String priceTag() {
		return name
				+ " $ "
				+ String.format("%.2f", price);
		
	}
}
