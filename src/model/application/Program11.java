package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account2;
import model.exception.BusinessException;

public class Program11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.err.println("Numero: ");
		int number = sc.nextInt();
		System.out.println("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account2 acc = new Account2(number, holder, balance, withdrawLimit);
				
		System.out.println();
		System.out.println("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
//		acc.withdraw(amount);
//		System.out.printf("Novo saldo: %.2f%n ", acc.getBalance());
		
		
		
		sc.close();

	}

}
