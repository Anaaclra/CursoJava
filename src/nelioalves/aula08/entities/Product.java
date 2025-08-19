package nelioalves.aula08.entities;

public class Product {

	private String name;
	private double price;
	
	//constructors
	public Product(String name, double price) {
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
