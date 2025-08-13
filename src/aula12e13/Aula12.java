package aula12e13;

public class Aula12 {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setIdade(12);
		m.setMembros(1234);
		m.setPeso(67.0);
		m.alimentar();
		m.emitirSom();
		m.locomover();
		
	}

}
