package nelioalves.aula12.entities;

public class Invoice {

	private double basicPayment;
	private double tax;
	private double totalPayment; //campo calculado
	
	//construtores
	public Invoice() {
		
	}
	public Invoice(double basicPayment, double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
//		this.totalPayment = totalPayment;//campo calculado
	}

	//getters e setters
	public double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotalPayment() {
		return getBasicPayment() + getTax();
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	
	
}
