package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Salary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int id, nEmp;
		String name;
		double salary, perc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		nEmp = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= nEmp; i++) {
			System.out.println("\nEmployee #" + i + ":");
			System.out.println("ID: ");
			id = sc.nextInt();
			
			sc.nextLine();
			
			while(fUnique(list, id) != null) {
				
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
				sc.nextLine();
				
			}
			
			System.out.println("Name: ");
			name = sc.nextLine();
			
			System.out.println("Salary: ");
			salary = sc.nextDouble();		
			
			Employee employee = new Employee(id, name, salary);
			
			list.add(employee);
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		id = sc.nextInt();
		
		Employee emp = fUnique(list,id);
		
		if(emp == null)
			System.out.println("This id does not exist!");
		else {				
			System.out.println("Enter the percentage: ");
			perc = sc.nextDouble();
			emp.raiseSalary(perc);
			
			System.out.println();
			System.out.println("List of employees:");
			for (Employee e : list) {
				System.out.println(e);
			}	
			 
		}					
		
		sc.close();								

	}
	
	public static Employee fUnique(List<Employee> list, int id) {
		
		Employee aux = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return aux;
		
	}

}
