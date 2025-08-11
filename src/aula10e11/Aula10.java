package aula10e11;

public class Aula10 {

	public static void main(String[] args) {
		
		//criei 4 objetos de classes diferentes.
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Aline");
		p1.setSexo("Feminino");
		
		p2.setNome("Adriano");
		p2.setIdade(13);
		p2.setSexo("Masculino");
		p2.setCurso("Informática");
		
		p3.setNome("Gabriela");
		p3.setSalario(2300.0);
		p3.setSexo("Feminino");
		
		p4.setNome("Heitor");
		p4.setSexo("Masculino");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
