package java_mulu;

import java.io.File;

public class test_main {
	/*
	 * boolean isDirectory() :判断是否是目录
	boolean mkdir()  :创建当前目录
	boolean mkdirs() :创建当前目录和上级目录
	String[] list() :列出所有的文件名
	File[] listFiles() :列出所有文件对象
	static File[] listRoots() :列出系统盘符

	 */
public static void main(String[] args) {
	File file1=new File("/Users/lee/Desktop/abc1/1.jpg");
	File file = new File("/Users/lee/Desktop/abc1");
	File file2 = new File("/Users/lee/Desktop/abc1/a");
	File file3 = new File("/Users/lee/Desktop/abc1/a/c/v/c");

	//判断是否是目录
	if(file1.isDirectory())
		System.out.println("是目录");
	else 
		System.out.println("不是目录");
	
	if(!file3.exists()){		
		//该文件不存在则创建
	if(file3.mkdirs()) // mkdir 只能创建一层目录
		System.out.println(true);
	else 
		System.out.println(false);
	}
	else
		System.out.println("创建失败，该文件目录已经存在");
	
	String str[]=file.list();
	for (String string : str) {
		System.out.println(string);
	}
	System.out.println("fileObject-----------------------------");
	File fileObject[]=file.listFiles();
	for (File file4 : fileObject) {
		System.out.println(file4.toPath());
	}
}
}
