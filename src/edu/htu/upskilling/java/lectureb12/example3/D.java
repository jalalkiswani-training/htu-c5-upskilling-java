package edu.htu.upskilling.java.lectureb12.example3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D {

	public void m3() throws IOException {
		FileReader fr;
//		try {
			fr = new FileReader("ata.txt");
			BufferedReader reader=new BufferedReader(fr);
			fr.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found");
////			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("Unable to read from file");
//			//e.printStackTrace();
//		}
		
	}

}
