package model.entities;

public class PessoaJuridica extends Contribuinte{

	private int numeroFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numeroFundionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	//métodos
	@Override
	public double calcularImposto() {
		double imposto;
		double renda = this.getRendaAnual(); //renda representa o imposto anual
		if(numeroFuncionarios > 10) {
			imposto = renda * 0.14;
		} else {
			imposto = renda * 0.16;
		}
		return imposto;
	}
}
