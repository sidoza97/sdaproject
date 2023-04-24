package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("second.txt");
		fw.write("hello java class");
		fw.close();
		
		FileReader fr = new FileReader("second.txt");
		int i = 0;
		while((i=fr.read())!=-1)
			System.out.println((char)i);
		
	}

}
