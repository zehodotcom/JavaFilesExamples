package main;

import java.io.*;

public class main {
	/*
	 To manipulate files, there are always three steps: 
	 - Open the file 
	 - Save data or read data 
	 - Close the file
	 */
	public static void main(String[] args) {
		BufferedWriterExample();
	}
	
	
	public static void BufferedWriterExample() {
		System.out.println("Creating a text file...");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("fileText.txt")));
			bw.write("Hello");
			bw.newLine();
			bw.write("I am a text file");
			bw.close();
		} 
		catch (IOException ex) {
			System.out.println("Issue: " + ex.getMessage());
		}
	}
}
