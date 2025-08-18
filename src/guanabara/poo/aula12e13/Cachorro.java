package guanabara.poo.aula12e13;

public class Cachorro extends Lobo {

	//sobreposição
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	public void enterrarOsso() {
		System.out.println("Enterrando o osso");
	}
	
	public void abanarRabo() {
		System.out.println("abanando o rabo");
	}
	
	//sobrecarga
	public void reagir(String frase) {
		if(frase == "Toma Comida" || frase == "Olá") {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanar Rabo!");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		}else {
			System.out.println("abanar e Latir.");
		}
	}
	public void reagir(boolean dono) {
			if(dono) {
				System.out.println("Abanar");
			}else {
				System.out.println("Rosnar e Latir.");
			}
		}
	public void reagir(int idade, double peso) {
		if (idade <5) {
			if(peso <10) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
		}else if (peso<10) {
			System.out.println("Rosnar");
		}else {
			System.out.println("Ignorar");
		}
	}
}
