package com.java.IO.PrinttWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_main {
public static void main(String[] args) throws FileNotFoundException {
	Scanner in =new Scanner(new File("cba.txt"));
	while(in.hasNext()){
		System.out.println(in.next());
	}
	
//	String s =in.next();
//	System.out.println(s);
}
}
