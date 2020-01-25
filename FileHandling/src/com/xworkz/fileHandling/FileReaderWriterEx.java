package com.xworkz.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx {
	public static void main(String[] args) {
		String filename = "C:\\IOExample\\fileRW.txt";
		try(FileWriter fw = new FileWriter(filename);
				FileReader fr = new FileReader(filename);) {
			
			String str = "Hello World!!";
			
			fw.write(str);
			fw.write("How are you ?");
			fw.flush();
			
			char[] chr = new char[50];
			fr.read(chr);
			
			for(char c :chr) {
				System.out.print(c);
			}
			System.out.println("\nCompleted reading");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
