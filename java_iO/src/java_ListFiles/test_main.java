package java_ListFiles;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class test_main {
	static 	File file =new File("/Users/lee/Desktop/abc"); 
public static void main(String[] args) {
	//fun1();
	fun2();
}


/*
 * 文件过滤方法
 * dir：绝对路径
 * name:文件名
 */
	public static void fun1()
{
		file.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				if(name.endsWith("java")&& new File(dir,name).isFile())	
				{
					System.out.println(name);
					return true;
				}
				else return false;
			}
			
		});	
		
		
		
}
	
	public static void fun2(){
		File[] str=file.listFiles(new FileFilter()
		{

			public boolean accept(File pathname) {
				//判断是否是目录
				return pathname.isDirectory();			
				}
			
		}
		);
		for (File string : str) {
			System.out.println(string.toPath());
		}
	}
	
	
	
	
	
	
	
	
}
