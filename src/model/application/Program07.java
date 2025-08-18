package model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee2;
import model.entities.OutsourcedEmployee;

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee2> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee # " + i + " data:");
			System.out.println("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee2 emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee2 emp = new Employee2(name, hours, valuePerHour);
				list.add(emp);
			}
		}

		System.out.println();
		System.out.println("Payments: ");

		for (Employee2 emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}
