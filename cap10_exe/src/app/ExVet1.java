package app;

import java.util.Scanner;

import entities.Rent;

public class ExVet1 {

	public static void main(String[] args) {
				
		int students, room;
		String name, email;		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented? ");
		students = sc.nextInt();
		
		Rent[] vect = new Rent[10];
		
		for(int i = 1;i <= students; i++) {
			System.out.println("\nRent#" + i + ":");
			System.out.print("Name:");
			
			sc.next();
			name = sc.nextLine();			
			
			System.out.println("E-mail:");
			email = sc.next();
			
			System.out.println("room:");
			room = sc.nextInt();
			
			Rent rent = new Rent(name,email,room); 
			
			vect[room] = rent;			
			
		}
		
		sc.close();
		
		System.out.println("\nBusy Rooms:");
		
		for(Rent obj : vect) {
			if(obj != null)
				System.out.println(obj);			
		}
	}

}
