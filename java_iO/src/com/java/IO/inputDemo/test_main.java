package com.java.IO.inputDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test_main {
	public static void main(String[] args) throws IOException {
		//1.创建源
		File file =new File("abc.txt");
		File file1= new File("aaa.txt");
		System.out.println(file1.exists());
		//2.输入流
		FileInputStream in =new FileInputStream(file);
		//3.读操作
//		int read=in.read();
	
//		System.out.println(read);
		byte [] bytes= new byte[10];
		int len=-1;
		while((len = in.read(bytes)) !=-1){
			System.out.println("len "+len);
			System.out.println(new String(bytes,0,len));
		}
		//4.关闭操作
		in.close();
	}
}
