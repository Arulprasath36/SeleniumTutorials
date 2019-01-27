package fileWritingOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingFOS.txt";
		 String content="Share this if you like my videos!!!";
		 
	FileOutputStream outputStream= new FileOutputStream(location);
	byte[] writeThis=content.getBytes();
	outputStream.write(writeThis);
	outputStream.close();	
		
	}

}
