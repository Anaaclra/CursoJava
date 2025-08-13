package projetoyoutube;

public class Aula14 {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de Poo", 1, 0, 1, true);
		v[1] = new Video("Aula 12 de PHP", 1, 0, 1, true);
		v[2] = new Video("Aula 10 de HTML5", 1, 0, 1, true);
		
		System.out.println(v[0].toString());

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Ana", 19, "F", "Anninha");
		g[1] = new Gafanhoto("Miguel", 11, "M", "Miguelzitooo");
		
		System.out.println(g[0].toString());
	}

}
