package com.java.IO.BufferReaderDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test_main {

public static void main(String[] args) throws IOException {
	System.out.println(1);
	BufferedWriter wirter =new BufferedWriter(new FileWriter(new File("Buffer.txt")));
	wirter.write("锄禾日当午");
	wirter.write("汗滴禾下土");
	wirter.write("锄禾日当午");
	wirter.write("锄禾日当午");

	wirter.close();

	 BufferedReader reder = new BufferedReader(new FileReader(new File("Buffer.txt")));
	int len = -1;
	char chars[] =new char [5];

	while((len = reder.read(chars)) != -1){
		System.out.println(new String(chars,0,len));
	}
	
	reder.close();
	
}
}
