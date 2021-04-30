package app;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class AppEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees: ");
		int empNum = sc.nextInt();
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		for(int i = 1; i <= empNum; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced (y/n)? ");
			char answ = sc.next().charAt(0);
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			//Employee emp = new Employee(name, hours, valuePerHour);					
			
			if(answ == 'y') {
				System.out.println("Additional Charge: ");
				double add = sc.nextDouble();				
				emps.add(new OutsourcedEmployee(name,hours,valuePerHour,add));
			}
			else				
				emps.add(new Employee(name,hours,valuePerHour));			
		}
		
		System.out.println("PAYMENTS:");
		
		for(Employee emp : emps) {			
			System.out.println(emp.getName() + " - $ " + emp.payment());			
		}		
		
		sc.close();

	}

}
