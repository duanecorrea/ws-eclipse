package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prog3 {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\teste2.txt";
		
		String[] lines = new String[] {"1","2","3"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
			
		}

	}

}
