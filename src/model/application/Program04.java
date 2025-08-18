package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;

public class Program04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println(("Tax: "));
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + emp);
		sc.close();
	}

}
