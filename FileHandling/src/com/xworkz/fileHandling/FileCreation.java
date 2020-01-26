package com.xworkz.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		
		File f = new File("C:\\IOExamples\\test.txt");
		//Added from GitHub directly
		String path = "C:"+f.separator+"IOExample"+f.separator+"test.txt";
		try {
			f.createNewFile(); //If dir doesn't exist //parent folder must be present
			System.out.println("Sucessfully created file");
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.canExecute());
		 	System.out.println(f.getName());
			System.out.println(f.getParent());
			System.out.println(f.isFile());		
			
			System.out.println(f.delete());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
