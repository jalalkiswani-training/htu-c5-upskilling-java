package edu.htu.upskilling.java.lecture5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files1 {
	public static void main(String[] args) {
		// if giving only the file name: it will assume that it is in the
		// current working directory
		String msg = readFile("hello.txt");
		System.out.println(msg);
		writeToFile("output.txt", "Hello from Java");
	}

	public static void writeToFile(String fileName, String msg) {
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.append(msg);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readFile(String fileName) {
		try {
			FileReader file = new FileReader(fileName);
			String fileContents = "";
			int c;
			while ((c = file.read()) != -1) {
				fileContents += (char) c;
			}
			file.close();
			return fileContents;
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			return null;
		}
	}
}
