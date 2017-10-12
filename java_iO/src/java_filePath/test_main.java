package java_filePath;

import java.io.File;
import java.io.IOException;

public class test_main {
public static void main(String[] args) {
	File file1=new File("/Users/lee/Desktop/");
	File file=new File("abc");
	
	//绝对路径
	String absolutePath =file.getAbsolutePath();
	System.out.println(absolutePath);
	
	//上层目录 ： 只有绝对路径才能找到
	System.out.println(file1.getParent());
	
	try {
		fun2();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	fun3();
}

	public static void fun2() throws IOException{
		
		File file = new File("/Users/lee/Desktop/test1");
		File file1 = new File("/Users/lee/Desktop/test2");
		boolean b1=false;
		//判断文件是否存在
		if(!file1.exists()){
			 b1=file1.createNewFile();
		}
		//修改名字
		file1.renameTo(file);
		System.out.println("createNewFile:"+b1);
		System.out.println("canRead："+file.canRead());
		
		System.out.println("length："+file.length());
		
	}
	
	
	public static void fun3(){
		//输出目录下所有文件
		File file2=new File("/Users/lee/Desktop");
		String[] str=file2.list();
		for(String s : str){
			System.out.println(s);
		}
		
		
		
		
	}

	
	
	
	
}

