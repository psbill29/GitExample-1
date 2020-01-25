package com.xworkz.fileHandling;

import java.io.IOException;
import java.util.Scanner;

public class StandardStreams {
	public static void main(String[] args) {

		System.out.println("Hello");
		System.err.println("This error");
		
		try {
			int read = System.in.read(); 
			if( read !=-1) {
				System.out.println("ASCII: "+read);
				System.out.println((char)read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
