package hust.soict.cybersec.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
		String filename = "test.exe";
		byte[] inputBytes = { 0 }; // an array containing a single byte with the value "0"
		long startTime, endTime;
		
		try { // perform some I/O operation that may throw an IOException: attempting to open a file
			
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) { // handle the IOException
			System.out.println("Error reading file: " + e.getMessage());
		}
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b: inputBytes) {
			outputStringBuilder.append((char) b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
