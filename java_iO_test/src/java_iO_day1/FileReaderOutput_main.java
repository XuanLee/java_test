package java_iO_day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderOutput_main {
public static void main(String[] args) throws Exception {
		
	File file =new File("abctest.txt");
	Reader reader =new FileReader(file);
	
	 char cArray [] =new char[4];
	 int len=-1;
	 String str="";
	 while((len=reader.read(cArray))!=-1){
		 str=new String(cArray, 0, len);
		 System.out.println(str);
	 }
}
}
