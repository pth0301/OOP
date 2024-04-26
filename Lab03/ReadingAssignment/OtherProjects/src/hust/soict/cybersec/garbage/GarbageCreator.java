package hust.soict.cybersec.garbage;

import java.io.IOException;// class is a checked exception to indicate an error has occurred during i/o operations
import java.nio.file.Files; // a class in Java's standard library: provides static methods for operating on files
import java.nio.file.Paths; // another class in java standard library: represent file and directory paths


public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		String filename = "test.exe";
		byte[] inputBytes = { 0 }; // an array containing a single byte with the value "0"
		long startTime, endTime;
		
		try { // perform some I/O operation that may throw an IOException: attempting to open a file
			
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) { // handle the IOException
			System.out.println("An error occurred: " + e.getMessage());
		}
		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b: inputBytes) {
			outputString += (char) b; // downcasting
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
