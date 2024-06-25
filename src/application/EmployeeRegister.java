package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee2;

public class EmployeeRegister {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// LISTA 
		List<Employee2> lista = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = Integer.parseInt(sc.nextLine());
		
		// LOOP PARA PEGAR AS INFORMAÇÕES E ARMAZENAR
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.printf("Employee #%d:", i+1);
			System.out.println();
			System.out.print("Id: ");
			int id = Integer.parseInt(sc.nextLine());
			for (Employee2 person : lista) {
				while (person.getId() == id) { 
					System.out.println("This id already exists!");
					System.out.print("Enter another id number: ");
					id = Integer.parseInt(sc.nextLine());
				}		
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			
			Employee2 emp = new Employee2(id, name, salary);
			lista.add(emp);
			System.out.println();
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = Integer.parseInt(sc.nextLine());
		int comp = 0;
		for (Employee2 person : lista) {
			if (person.getId() == id) {
				comp = 1;
				System.out.print("Enter the percentage: ");
				person.increaseSalary(sc.nextDouble());
				System.out.println();
			}
		}
		if (comp == 0) {
			System.out.println("This id does not exist!");
			System.out.println();
		}
		// FOR EACH PARA IMPRIMIR NA TELA
		System.out.println("List of employees:");
		for (Employee2 e : lista) {
			System.out.println(e);
		}
		sc.close();
	}

}
