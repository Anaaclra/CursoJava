package exercicios;

import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
	
		//declaração das variáveis
		
		double salario;
		double aliquota;
		double deducao;
		double impostoMensal;
		double impostoAnual;
		
		// obtenção dos valores (ENTRADA)
		Scanner reader = new Scanner(System.in); 
		System.out.print("Digite o Salário bruto mensal: R$");
		salario = reader.nextDouble();
		
		//cálculo do imposto (PROCESSAMENTO)
		if(salario > 4664.68) { //faixa 5
			aliquota = 27.5;
			deducao = 869.36;
		}else if(salario <= 4664.68 && salario >= 3751.06) { //faixa 4
			aliquota = 22.5;
			deducao = 636.13;
		}else if(salario <= 3751.05 && salario >= 2826.66) { //faixa 3	
			aliquota = 15;
			deducao = 354.80;
		}else if(salario <= 2826.65 && salario >= 1903.99) { //faixa 2
			aliquota = 7.5;
			deducao = 142.80;
		}else {//faixa 1
			aliquota = 0;
			deducao = 0;
		}
		impostoMensal = salario*(aliquota/100.0) - deducao;
		impostoAnual = impostoMensal*12;
		
		//exibição dos resultados (SAÍDA)
		System.out.println("Salário: R$" +salario);
		System.out.println("Aliquota: R$" +aliquota);
		System.out.println("Imposto Mensal: R$" +impostoMensal);
		System.out.println("Imposto Anual: R$" +impostoAnual);
	}
}
