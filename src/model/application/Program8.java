package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product3;
import model.entities.UsedProduct;

public class Program8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product3> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product # " + i + " data:");
			System.out.println("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Price: ");
			double price = sc.nextDouble();
			
			if(type == 'i') {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}else if(type == 'u') {
				System.out.println("Manufacture date (dd/MM/yyyy: ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}else {
				list.add(new Product3(name, price));
			}
			
			System.out.println(); // pular linha
			System.out.println("Price tags: ");
			for(Product3 p : list) {
				System.out.println(p.priceTag());
			}
		
		}sc.close();
	}	
}
