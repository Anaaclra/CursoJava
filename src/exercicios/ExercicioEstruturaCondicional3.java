package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaCondicional3 {

	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		ordem crescente ou decrescente.*/ 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("SÃO MÚLTIPLOS.");
		}else {
			System.out.println("NÃO SÃO MÚLTPLOS.");
		}
		
		sc.close();
	}

}
