package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Student;

public class ProgramStudent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Set<Student> setStudents = new HashSet<Student>();
		
		System.out.print("How many students for course A? ");
		int a = Integer.parseInt(sc.nextLine());
		for (int i=0; i<a; i++) {
			setStudents.add(new Student(Integer.parseInt(sc.nextLine())));
		}
		System.out.print("How many students for course B? ");
		int b = Integer.parseInt(sc.nextLine());
		for (int i=0; i<b; i++) {
			setStudents.add(new Student(Integer.parseInt(sc.nextLine())));
		}
		System.out.print("How many students for course C? ");
		int c = Integer.parseInt(sc.nextLine());
		for (int i=0; i<c; i++) {
			setStudents.add(new Student(Integer.parseInt(sc.nextLine())));
		}
		System.out.println("Total students: " + setStudents.size());
		sc.close();
	}
	
}
