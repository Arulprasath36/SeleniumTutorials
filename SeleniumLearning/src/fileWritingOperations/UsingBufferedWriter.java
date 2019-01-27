package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingBufferedWriter.txt";
		String content="Winter is Coming!!!";
		 
	FileWriter fileWriter = new FileWriter(location);	 
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	bufferedWriter.write(content);
	bufferedWriter.close();
		
	}

}
