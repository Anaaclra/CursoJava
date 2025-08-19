package nelioalves.aula09.entities;

public class PessoaFisica extends Contribuinte {

	private double gastosSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	//métodos
	@Override
	public double calcularImposto() {
		double imposto;
	    // usa a renda da superclasse
		double renda = this.getRendaAnual();
		if (renda < 20000.0) {
			imposto = renda * 0.15;
		}else {
			imposto = renda * 0.25;
		}
	    // aplica desconto da saúde
		imposto -= gastosSaude * 0.50;
		
		// imposto não pode ser negativo
		if (imposto < 0) {
			imposto = 0.0;
		}
		
		return imposto;
	}
	
	
	
	
}
