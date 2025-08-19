package nelioalves.aula08.entities;

public class ImportedProduct extends Product{

	private double customsFee;
	
	//constructor		
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	//getters e setters
	public double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	//métodos

	@Override
	public String priceTag() {
		return getName() +
				" $ "
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
				
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
}
