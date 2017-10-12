package com.java.IO.OutPut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class test_main {

	public static void main(String[] args) throws IOException {
	    //1.创建源	
		File file =new File("abc.txt");
		//2.创建流
		OutputStream out=new FileOutputStream(file);
		//3.写入文件
		out.write(97);
		out.write(new byte[]{65,67,77});
		
		//4.关闭
		out.close();
		
		
	}
}
