package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in3.txt";			
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			List<Employee> emp = new ArrayList<>(); 
			
			while(line != null) {
				
				String[] str = line.split(",");
				
				emp.add(new Employee(str[0], str[1], Double.parseDouble(str[2])));
				
				line = br.readLine();
			}
			
			Double salary = 2000.00;
			
			List<String> s1 = emp.stream().filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			s1.forEach(System.out::println);
			
			Double sum = emp.stream().filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println(sum);
					
					
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 	

	}

}
