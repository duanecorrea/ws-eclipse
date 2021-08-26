package cap19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProgMap {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in2.txt";			
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			Map<String, Integer> map = new LinkedHashMap<>(); 
			
			while(line != null) {
				
				String[] str = line.split(",");
				
				int count = Integer.parseInt(str[1]);
				
				if (map.containsKey(str[0])) {
					int aux = map.get(str[0]);
					map.put(str[0], count + aux);
				}
				else {
					map.put(str[0], Integer.parseInt(str[1]));;
				}				
				
				line = br.readLine();
			}
			
			for(String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
				
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 	

	}

}
