package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product1;
import model.entities.UsedProduct;

public class Product1Program {

	public static void main(String[] args) throws ParseException {
		
		List<Product1> lista = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of products: ");
		Integer n = Integer.parseInt(sc.nextLine());
		
		// LOOP PARA PRODUTOS
		for (int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data:\n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			String c = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = Double.parseDouble(sc.nextLine());
			if (Objects.equals("i", c)) {
				System.out.print("Customs Fee: ");
				Double fee = Double.parseDouble(sc.nextLine());
				Product1 prod = new ImportedProduct(name, price, fee);
				lista.add(prod);
			}
			else if (Objects.equals("u", c)) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.nextLine();
				Product1 prod = new UsedProduct(name, price, sdf.parse(date));
				lista.add(prod);
			}
			else {
				Product1 prod = new Product1(name, price);
				lista.add(prod);
			}
		}
		System.out.println("PRICE TAGS:");
		for (Product1 prod : lista) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
