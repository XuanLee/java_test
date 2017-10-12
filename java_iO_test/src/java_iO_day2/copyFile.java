package java_iO_day2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class copyFile {
public static void main(String[] args) throws IOException {
	File srcFile =new File("/Users/lee/Desktop/iOS/12-本地私有库实现.mp4");
	File destFile =new File("/Users/lee/Desktop/12-本地私有库实现.mp4");
	fun4(srcFile,destFile);
	
}
	
	// FileInputStream 679
	static void fun1(File srcFile,File destFile) throws IOException{
		long begin =System.currentTimeMillis();
		FileInputStream in =new FileInputStream(srcFile);
		FileOutputStream out =new FileOutputStream(destFile);
		byte bytes [] =new byte[1024];
		int len =-1;
		while((len=in.read(bytes))!= -1){
			out.write(bytes);
		}
		in.close();
		out.close();
		System.out.println(System.currentTimeMillis() - begin);
	}
	
	//6500
	static void fun2(File srcFile,File destFile) throws IOException{
		long begin =System.currentTimeMillis();
		Reader reder =new FileReader(srcFile);
		Writer writer =new FileWriter(destFile);
		char []chats =new char[1024];
		int len =-1;
		while((len = reder.read(chats))!= -1){
			writer.write(chats);
		}
		reder.close();
		writer.close();
		System.out.println(System.currentTimeMillis() - begin);
	}
	
	//513
	static void fun3(File srcFile,File destFile) throws IOException{
		long begin =System.currentTimeMillis();
		BufferedInputStream in =new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream out =new BufferedOutputStream(new FileOutputStream(destFile));
		byte bytes[] =new byte[1024];
		int len = -1;
		while((len = in.read(bytes))!= -1){
			out.write(bytes);
		}
		in.close();
		out.close();
		System.out.println(System.currentTimeMillis() - begin);
	}
	
	
	//6746
		static void fun4(File srcFile,File destFile) throws IOException{
			long begin =System.currentTimeMillis();
			BufferedReader reder =new BufferedReader(new FileReader(srcFile));
			BufferedWriter writer =new BufferedWriter(new FileWriter(destFile));
			char []chats =new char[1024];
			int len =-1;
			while((len = reder.read(chats))!= -1){
				writer.write(chats);
			}
			reder.close();
			writer.close();
			System.out.println(System.currentTimeMillis() - begin);
		}	
	
	
	
	
	}
	
	
	

