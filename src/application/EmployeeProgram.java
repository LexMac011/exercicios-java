package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import model.entities.Employee;
import model.entities.OutsourcedEmployee;

public class EmployeeProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//LISTA DE FUNCIONARIOS
		List<Employee> empLista = new ArrayList<Employee>();
		
		
		// BORA COMEÇAR PEGANDO O NUM DE FUNCIONARIOS
		System.out.print("Enter the number of employees: ");
		Integer n = Integer.parseInt(sc.nextLine());
		
		// BLZ, AGORA VEM O LOOP PARA PEGAR OS DADOS, CRIAR OS OBJETOS E ARMAZENAR NA LISTA
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d data:", i+1);
			System.out.println();
			System.out.print("Outsourced (y/n)? ");
			String q = sc.nextLine();
			
			if (Objects.equals(q, "y")) { // ISSO AQUI É O PULO DO GATO, ME SALVOU
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = Integer.parseInt(sc.nextLine());
				System.out.print("Value per hour: ");
				Double value = Double.parseDouble(sc.nextLine());
				System.out.print("Additional charge: ");
				Double adC = Double.parseDouble(sc.nextLine());
				Employee emp = new OutsourcedEmployee(name, hours, value, adC);
				empLista.add(emp);
			}
			if (Objects.equals(q, "n")) { // CASO NÃO SEJA TERCEIRIZADO
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = Integer.parseInt(sc.nextLine());
				System.out.print("Value per hour: ");
				Double value = Double.parseDouble(sc.nextLine());
				Employee emp = new Employee(name, hours, value);
				empLista.add(emp);
			}
		}
		System.out.println("PAYMENTS:");
		for (Employee emp : empLista) {
			System.out.println(emp.toString());
		}
		
		sc.close();
	}
}
