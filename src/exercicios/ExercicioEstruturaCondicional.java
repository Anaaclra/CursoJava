package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaCondicional {

	public static void main(String[] args) {
	
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); {
			
			int N = sc.nextInt();
		
			if(N < 0) {
				System.out.println("NEGATIVO");
			}else {
				System.out.println("POSITIVO");
			}
			sc.close();
		}
		

	}

}
