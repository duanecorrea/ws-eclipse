package application;

import java.io.File;


public class Prog5 {

	public static void main(String[] args) {
			
		String strPath = "c:\\temp\\teste.txt";
		
		File path = new File(strPath);
		
		System.out.println(path.getName());
		System.out.println(path.getParent());
		System.out.println(path.getPath());
		
		

	}

}
