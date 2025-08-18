package guanabara.poo.aula10e11;

public class Aluno extends Pessoa{

	private int matricula;
	private String curso;
	
	public void cancelarMatr() {
		
	}
	public void pagarMensalidade() {
		System.out.println("Pagamento mensalidade de aluno " + this.getNome());
	}
	
	//métodos especiais
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
