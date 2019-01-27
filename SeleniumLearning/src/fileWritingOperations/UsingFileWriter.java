package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1. file location 2. content
		
		 String location="UsingFileWriter.txt";
		 String content="Learning Java is simple!";
		 
		 FileWriter fileWriter = new FileWriter(location);
		 
		 fileWriter.write(content);
		 
		 fileWriter.close();
		
	}

}
