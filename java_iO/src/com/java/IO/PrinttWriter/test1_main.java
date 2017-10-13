package com.java.IO.PrinttWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class test1_main {
public static void main(String[] args) throws IOException {
	InputStream in =new FileInputStream(new File(""));

	System.setIn(new FileInputStream(new File("print.txt")));
	//System.setOut(new PrintStream(new File("print.txt")));
	int read = System.in.read();
	System.out.println(read);
}
}
