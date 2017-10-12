package java_iO_day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream_main {
public static void main(String[] args) throws Exception {
	
	File file =new File("abctest.txt");
	System.out.println(file.isFile());
	
	FileInputStream in =new FileInputStream(file);
	
	/*读取file里面第一个字符 通过int保存*/
	//读取一个字节并返回，没有字节返回-1
	//int n1=in.read();
	//System.out.println("read(): "+n1);
	
	byte[] b =new byte[5];
	/*int a=read(b)  返回数组的长度*/
	//取一定量的字节数，并存储到字节数组中，返回读取到的字节数。
	//System.out.println("read(b): "+in.read(b));
	// ABCDEfghijklmn
	//ABCDE 
	//fghij
	int len=-1;  
	String str="";
	while((len = in.read(b))!=-1){
		System.out.println("len:"+len);
		//string有一个构造方法 截取数组从off到len的长度
		str= new String(b, 0, len);
		System.out.println(str);
	}
	
	
	
	in.close();
}

}
