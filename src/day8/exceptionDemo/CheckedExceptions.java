package day8.exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args)  {
		
		System.out.println("Program Started ....");
		
		
			try {
				FileInputStream fis = new FileInputStream("C:\\file.txt");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
	
		System.out.println("....End....");

	}

}
