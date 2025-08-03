package exercicios;

import java.util.Scanner;

public class ExercicioEstruturaRepetitivaFor4 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/ 
		Scanner sc = new Scanner(System.in); {
			
			int N = sc.nextInt();
			
			for (int i=0; i<=N; i++) {
				int X = sc.nextInt();
				int Y = sc.nextInt();
								
				if (Y == 0) {
					System.out.println("divisao impossivel");
				} else {
					double div = (double) X/Y;
					System.out.printf("%.1f%n", div);
				}
			}
			sc.close();
		}
	}

}
