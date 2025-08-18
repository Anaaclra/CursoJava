package entities;

public abstract class Contribuinte {

	private String nome;
	private double rendaAnual;
	
	//construtor
	public Contribuinte(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	
	//método abstrato
	public abstract double calcularImposto();
	
}
