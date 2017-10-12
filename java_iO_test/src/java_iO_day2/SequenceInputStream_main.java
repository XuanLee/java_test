package java_iO_day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream_main {
	//把多个输入流合并成一个对象
	public static void main(String[] args) throws IOException {
		File file =new File("day2.txt");
		File file1= new File("123.txt");
		SequenceInputStream seq =new SequenceInputStream(new FileInputStream(file),new FileInputStream(file1));
		
		int len = -1;
		byte [] b= new byte[20];
		while((len = seq.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
	}
}
