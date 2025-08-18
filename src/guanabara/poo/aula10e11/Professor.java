package guanabara.poo.aula10e11;

public class Professor extends Pessoa{
	
	private String especialidade;
	private double salario;
	
	public void receberAum(double aum) {
		this.salario += aum;
	}

	//Métodos especiais
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
