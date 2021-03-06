package java_iO_day3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/*
 * 获取指定目录及子目录下所有txt文件的个数，并将这些txt文件复制到D盘下任意目录
 * 两种方法 
 * 1:Filtrate(file2.getName()) 用将file 和 fileNAme存入HashMap 筛选后根据fileName取出对应的file
 * 2:Filtrate 直接用file。判断字符串用file.toString
 */
public class test_main {
	//源路径
	static final String SRC_PATH = "/Users/lee/Desktop/tmp";
	//目标路径
	static final String DESC_PATH = "/Users/lee/Desktop/test1";
	//查询文件的后缀名
	static final String SUFFIX = "java";
	//文件的个数
	static  int fileCount =0;
	static HashMap<String, File> map =new HashMap<String, File>();
	public static void main(String[] args) throws IOException {
		File srcFile = new File(SRC_PATH);
		getAll(srcFile);
		System.out.printf("%s文件出现个数为:%d",SUFFIX,fileCount);
	}
	static void getAll(File file) throws IOException{
		File[] files=file.listFiles();
		for (File file2 : files) {
			//判断有没有目录
			if(file2.isDirectory()){
				getAll(file2);
			}
			//拿到所有文件
			else if(!file2.isHidden()){
					map.put(file2.getName(),file2);
					//Filtrate(file2.getName()); 	
					Filtrate(file2);
			}
		}
	}
	/*过滤文件*/
	static void Filtrate(String fileName) throws IOException{

		//1.找到 . 出现的最后一次位置
		int index=fileName.lastIndexOf(".");
		//2.截取后缀名
		String srcStr=fileName.substring(index+1);
		if("jpg".equals(srcStr)){
			//System.out.println(fileName);
			//3.取出fileName对应的value
			File file=map.get(fileName);
			copyFile(file);
			fileCount++;
		}
	}
	
	/*过滤文件*/
	static void Filtrate(File file) throws IOException{
		
		// 1.找到 . 出现的最后一次位置
		int index = file.toString().lastIndexOf(".");
		// 2.截取后缀名
		String srcStr = file.toString().substring(index + 1);
		if (SUFFIX.equals(srcStr)) {
			copyFile(file);
			fileCount++;
		}
	}
	//筛选后的文件复制到DESC_PATH路径下
	static void copyFile(File srcFile) throws IOException{
		//拼接路径
		String descpath = DESC_PATH+"/"+srcFile.getName();
		//System.out.println("descPath :"+descpath);
		File descFile =new File(descpath);
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream out= new BufferedOutputStream(new FileOutputStream(descFile));

		int len =-1;
		byte b[]=new byte[1024];
		while((len = in.read(b))!= -1){
			out.write(b);
		}	
		in.close();
		out.close();
	}
}
