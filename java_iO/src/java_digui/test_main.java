package java_digui;

import java.io.File;

public class test_main {
public static void main(String[] args) {
//	
//	int n=5;
//	int sum=getSum(n);
//	System.out.println(sum);
	
	File file=new File("/Users/lee/Desktop/tmp");
	getAll(file);
	
}
	static void getAll(File file){
		//1 拿到目录下所有文件
		File dir[]=file.listFiles();
	
		for (File file2 : dir) {
			//3.查看当前文件有没有目录(判断当前路径目录下又有没有其他文件)
			if(file2.isDirectory()){
//				System.out.println("目录为"+file2);
			 getAll(file2);
			}
			else if(!file2.isHidden())//筛选掉隐藏的文件
				//所有文件
				System.out.println(file2);
		}
		
		
	}











	public static int getSum(int n){
		if(n==1) return 1;
		return n + getSum(n-1);
	}
	
	
}
