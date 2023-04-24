package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException,FileNotFoundException {

		
		 
		FileOutputStream file = new FileOutputStream("D:\\MyData\\Desktop\\Java\\first.txt",true);
		/*	file.write('A');
			file.write('B');
			file.close();
			System.out.println("(Output): Write data in file");
			*/
			String s = "Java Class";
			file.write(s.getBytes());
			file.close();
			
			FileInputStream file1 = new FileInputStream("D:\\MyData\\Desktop\\Java\\first.txt");
			System.out.println("Reading File:" + (char)file1.read());
			
			int i =0;
			while((i=file1.read())!=-1)
					System.out.println((char)i);

		
		
		
	}

}
