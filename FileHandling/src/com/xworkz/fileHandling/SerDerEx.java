package com.xworkz.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerDerEx {
	public static void main(String[] args) {

		Demo demo = new Demo(10, "Krupa");
		String filename = "C:\\IOExample\\file.txt";
		
		try {
			FileOutputStream fout = new FileOutputStream(filename);
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			
			objout.writeObject(demo);
			objout.close();
			fout.close();
			
			System.out.println("Object was serialised:");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Demo implements Serializable {
	public int id;
	public String name;

	public Demo(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
