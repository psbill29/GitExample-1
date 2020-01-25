package com.xworkz.fileHandling;

import java.io.File;

public class CreateDirEx {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\ioFileExample\\krupa");
		System.out.println(f.exists() ? "Directory exist" 
				: "Directory does not exist"); 
		System.out.println(f.mkdir());//creates dir if not exist.

		System.out.println(f.getAbsolutePath());
		System.out.println("Can open file? "+f.canExecute());
		System.out.println("is file readable: "+f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isDirectory());
		System.out.println(f.isHidden());
//		System.out.println(f.delete());
		
		
		System.out.println(f.listFiles());
		
		System.out.println(f.list());
	}

}
