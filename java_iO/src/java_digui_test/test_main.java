package java_digui_test;

import java.io.File;

public class test_main {
	/*
	 * 3练习:列出文件的分层结构
		期望效果:abc>def>mm>nn>gg
	 * 
	 */
public static void main(String[] args) {
	System.out.println("1");
		File file =new File("/Users/lee/Desktop/abc");
		getAll(file);
}
public static void getAll(File file){
	//1.拿到所有文件对象
	File fileArray[]=file.listFiles();
	for (File file2 : fileArray) {
		//2.判断当前文件对象是否是目录
		if(file2.isDirectory()){
			getAll(file2);
		}
		else if(!file2.isHidden()){//可以拿到文件
		 getName(file2);

		}
	}
}

public static void getName(File file){
	
		String str = file.toString();
		String strArray[] = str.split("/");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
			if (!(i == 0 || i == strArray.length - 1)) {
				System.out.print(">");
			}
		}
		System.out.println();
	
	
	

	
	/*
	 * File getParentFile():获取上级目录文件
	 * String getParent() :获取上级目录路径
	 */
//	
//	File file1=file.getParentFile();
//	if(!file1.toString().equals("/")){
//		getName(file1);
//		System.out.println(file1);
//	}
//	else{
//	}
//	//System.out.println(file1);
	
	
	
}
}
