package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Grade 1: ");
		student.grade[0] = sc.nextDouble();
		System.out.println("Grade 2: ");
		student.grade[1] = sc.nextDouble();
		System.out.println("Grade 3: ");
		student.grade[2] = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f",student.calcFinal()));
		
		if (student.calcFinal() >= 60) 
			System.out.println("PASS");
		else { 
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f",student.calcMissing()) + " POINTS");
		}		
		
		sc.close();

	}

}
