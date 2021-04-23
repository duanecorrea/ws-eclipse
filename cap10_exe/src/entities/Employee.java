package entities;

public class Employee {
	
	Integer id;
	String  name;
	Double salary;
	
	public Employee(Integer id, String name, Double salary) {		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void raiseSalary(double perc) {
		this.salary = this.salary + (this.salary * perc);		
	}	
	
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salary;
	}

}
