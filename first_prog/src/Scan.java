import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
				
		/*double a,b,c;		
			
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();			
		
		sc.close();
		
		System.out.printf("Triangulo:  %.3f\n",a * c / 2);
		System.out.printf("Circulo: %.3f\n", 3.14159 * Math.pow(c, 2));
		System.out.printf("Trapezio: %.3f\n", (a + b) * c / 2);
		System.out.printf("Quadrado: %.3f\n",b * b);
		System.out.printf("Retangulo: %.3f\n", a * b);*/		
		
		/*double a;		
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		
		sc.close();
		
		if (a < 2000 )
			System.out.println("Isento");
		else if (a < 3000)
			System.out.printf("R$ %.2f\n", (a - 2000) * 0.08);		
		else if (a < 4500) 
			System.out.printf("R$ %.2f\n", 1000 * 0.08 + (a - 3000) * 0.18);
		else
			System.out.printf("R$ %.2f\n", 1000 * 0.08 + 1500 * 0.18 + (a - 4500) * 0.28);*/
		
		/*Scanner sc = new Scanner(System.in);
		
		int entry = 0;
		int gasolina = 0, alcool = 0, diesel = 0;
		
		while(entry != 4) {
			entry = sc.nextInt();
			
			switch(entry) {
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
			}			
		}
		sc.close();
		System.out.printf("MUITO OBRIGADO\n" + 
						  "Alcool: %d\n" + 
						  "Gasolina: %d\n" + 
						  "Diesel: %d\n", alcool, gasolina, diesel);*/
		
		Scanner sc = new Scanner(System.in);
		
		int entry = sc.nextInt();
		
		sc.close();
		
		for (int i=1; i <= entry; i++) 
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));

	}

}
