package entities;

public class Student {
	
	public String name;
	public double grade[] = new double[3];
	
	public double calcFinal() {
		return grade[0] + grade[1] + grade[2];
	}
	
	public double calcMissing() {
		return 60 - this.calcFinal();
	}
	

}
