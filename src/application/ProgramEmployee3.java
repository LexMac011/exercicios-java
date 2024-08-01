package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee3;

public class ProgramEmployee3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee3> employeeList = new ArrayList<>();
		
		System.out.print("Enter the full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] splitList = line.split(",");
				String name = splitList[0];
				String email = splitList[1];
				Double salary = Double.parseDouble(splitList[2]);
				
				Employee3 emp = new Employee3(name, email, salary);
				employeeList.add(emp);
				
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();
		System.out.print("Email of people whose salary is more than " + String.format("%.2f:\n", salary));
		
		Comparator<String> comp = (a, b) -> a.toUpperCase().compareTo(b.toUpperCase());
		
		List<String> emailList = employeeList.stream()
			.filter(e -> e.getSalary() > salary)
			.map(e -> e.getEmail()).sorted(comp)
			.collect(Collectors.toList());
		
		emailList.forEach(System.out::println);
		
		Double sum = employeeList.stream()
				.filter(e -> e.getName().charAt(0) == 'M')
				.map(e -> e.getSalary())
				.reduce(0.0, (s1, s2) -> s1 + s2);
				
		System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
				
		sc.close();
	}

}
