package edu.htu.upskilling.java.lectureb12.example1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("https://www.microsoft.com");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			InputStream inputStream = con.getInputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			StringBuffer contents = new StringBuffer();
			String line;
			while ((line = reader.readLine()) != null) {
				contents.append(line);
				contents.append("\r\n");
			}
			inputStream.close();
			System.out.println(contents);
		}catch(Exception e) {
			System.out.println("Error...");
			e.printStackTrace();
		}
//		} catch (MalformedURLException e) {
//			System.out.println("Invalid URL");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("Error reading contents");
//			e.printStackTrace();
//		}

	}
}
