package java_iO_day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class copyFile_main {
public static void main(String[] args) throws IOException {
	File file =new File("123.txt");
	File file1=new File("123copy.txt");
	
	//先将123.txt读出来
	Reader fileManger =new FileReader(file);
	Writer file1Manger =new FileWriter(file1);
	char[] cArray =new char[4];
	int len =-1;
	while((len=fileManger.read(cArray))!=-1){
		String str=new String(cArray, 0, len);
		file1Manger.write(str);
	}
	
	fileManger.close();
	//文件写入后必须刷新，flush 或者关闭 
	file1Manger.close();
	
	
}
}
