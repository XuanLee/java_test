package com.java.IO.BufferStreamDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class test_main {
       public static void main(String[] args) throws IOException {
    	   
		File file = new File("Buffer.txt");

		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
		out.write("sabsdf".getBytes());
    	out.close(); 

		FileInputStream input = new FileInputStream(file);
		BufferedInputStream in = new BufferedInputStream(input);

		byte[] bytes = new byte[3];
		int len = -1;
		System.out.println(in.read(bytes));
		while ((len = in.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, len));
		}
		in.close();
    	  
    	   
    	   
	}
}
