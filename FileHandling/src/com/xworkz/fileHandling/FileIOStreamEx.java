package com.xworkz.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamEx {
	public static void main(String[] args) {

		try {
			FileOutputStream out = new FileOutputStream("C:\\IOExample\\outfile.txt");
			
			out.write(65);
			
			String str = "Welcome Home!!";
			byte[] b = str.getBytes();
			out.write(b);
			out.close();
			
			System.out.println("writing was sucessfull");
			
			FileInputStream in = new FileInputStream("C:\\IOExample\\outfile.txt");
//			System.out.println("First char:"+(char)in.read());
			int i=0;
			while((i=in.read())!=-1) {
				System.out.print((char)i);
			}
			System.out.println("");
			System.out.println("Successfully read !!");
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
