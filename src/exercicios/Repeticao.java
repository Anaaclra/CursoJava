package exercicios;

public class Repeticao {

	public static void main(String[] args) {
		
		String[] nomes = { "João", "Maria", "Carla"};
		
//		for(int i = 0; i < nomes.length; i++) {
//			System.out.println(nomes[i]);
//		}
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
