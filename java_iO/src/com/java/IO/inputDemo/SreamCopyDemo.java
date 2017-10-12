package com.java.IO.inputDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SreamCopyDemo {
public static void main(String[] args) throws Exception {
		//1.源
		File file =new File("abc.txt");
		File destFile =new File("cba.txt");
		//2.流
		//2.1输入流
		FileInputStream in =new FileInputStream(file);
		//2.2输出流
		FileOutputStream out =new FileOutputStream(destFile);

		//3.
		byte [] bytes=new byte[3];
		int len = -1;
		while((len = in.read(bytes)) != -1){
			out.write(bytes,0,len);
			System.out.println(new String(bytes));
		}
		//4.关闭
		in.close();
		out.close();
}
}
