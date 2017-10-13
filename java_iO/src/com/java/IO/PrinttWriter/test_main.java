package com.java.IO.PrinttWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class test_main {
public static void main(String[] args) throws IOException {
	PrintWriter writer =new PrintWriter(new File("print.txt"));
	writer.print("abc".getBytes());
	writer.close();
}
}
