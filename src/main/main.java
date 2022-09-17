package main;
import java.io.*;

/*
 * To manipulate files, there are always three steps: 
 * - Open the file 
 * - Save data or read data 
 * - Close the file
 */
public class main {
	public static void main(String[] args) {
		WriteFile();
		ReadFile();
	}

	public static void WriteFile() {
		System.out.println("Creating a text file.");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("fileText.txt")));
			bw.write("Hello");
			bw.newLine();
			bw.write("I am a text file");
			bw.close();
		} catch (IOException ex) {
			System.out.println("there has been a issue: " + ex.getMessage());
		}
	}

	public static void ReadFile() {
		if (!(new File("fileText.txt")).exists()) {
			System.out.println("Not found fileText.txt");
			return;
		}
		System.out.println("Reading fileText.txt ...");
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("fileText.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException ex) {
			System.out.println("there has been a issue: " + ex.getMessage());
		}
	}
}