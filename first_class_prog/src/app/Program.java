package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Triangle x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X: ");		
		x = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter the measures of triangle Y: ");
		y = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		
		sc.close();
				
		double areaX = x.calc();
		double areaY = y.calc();
		
		System.out.println(areaX + " - " + areaY);

	}

}
