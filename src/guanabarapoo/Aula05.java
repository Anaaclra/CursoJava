package guanabarapoo;

public class Aula05 {

	public static void main(String[] args) {
		
	Conta p1 = new Conta();
	p1.setNumConta(4567-8);
	p1.abrirConta("CC");
	p1.setDono("Julia de Azevedo");
	p1.setSaldo(1000.0);
	p1.depositar(450.0);
	p1.sacar(250.0);
	p1.estadoAtual();		
	
	
	Conta p2 = new Conta();
	p2.setNumConta(4567-9);
	p2.abrirConta("CP");
	p2.setDono("Mario Carvalho");
	p2.setSaldo(1000.0);
	p2.depositar(50.0);
	p2.estadoAtual();		
		
		
	}

}
