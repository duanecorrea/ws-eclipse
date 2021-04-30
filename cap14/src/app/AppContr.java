package app;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Contr;
import entities.FisicContr;
import entities.JuridContr;

public class AppContr {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tax payers? ");
		int num = sc.nextInt();
		
		ArrayList<Contr> aContrs= new ArrayList<Contr>();
		
		for(int i=1; i<=num;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.println("Individual or company (i/c)?");
			char opt = sc.next().charAt(0);
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if(opt == 'i') {
				System.out.println("Health Expenditures: ");
				double health = sc.nextDouble();
				aContrs.add(new FisicContr(name,anualIncome,health));								
			} else {
				System.out.println("Number of employees: ");
				int emp = sc.nextInt();
				aContrs.add(new JuridContr(name,anualIncome,emp));				
			}
		}
		
		double sum = 0;
		System.out.println("TAXES PAID");
		for(Contr contr : aContrs) {
			System.out.printf("%s: $ %.2f", contr.getName(), contr.totPago());
			System.out.println();
			sum += contr.totPago();			
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f",sum);

		
		sc.close();
	}

}
