package cap19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ProgSet {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";			
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			Set<Integer> set = new HashSet<>(); 
			
			while(line != null) {

				set.add(Integer.valueOf(line));
				
				line = br.readLine();
			}
			
			System.out.println(set.size());
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 	
	}

}
