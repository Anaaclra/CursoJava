package guanabara.poo.aula10e11;

public class Bolsista extends Aluno{

	private boolean bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista! Pagamento realizado.");
	}

	//métodos especiais
	public boolean getBolsa() {
		return bolsa;
	}

	public void setBolsa(boolean bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
