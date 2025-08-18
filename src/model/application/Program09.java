package model.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contribuinte;
import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;


public class Program09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> lista = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			System.out.println("Contibuinte #" + i + " dados:");
			System.out.println("Pessoa física ou jurídica (f/j)? ");
			char tipo = sc.next().charAt(0);

			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Renda Anual: ");
			double rendaAnual = sc.nextDouble();

			if(tipo == 'f') {
				System.out.println("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.println("Numero de funcionários: ");
				int funcionarios = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");

		double total = 0.0;
		for (Contribuinte c : lista) {
			double imposto = c.calcularImposto();
			System.out.println(c.getNome() + ": R$ " + String.format("%.2f",imposto));
			total += imposto;
		}

		System.out.println();
		System.out.println("TOTAL DE IMPOSTO: R$ " + String.format("%.2f", total));


		sc.close();

	}

}
