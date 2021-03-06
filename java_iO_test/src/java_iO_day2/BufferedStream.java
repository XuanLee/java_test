package java_iO_day2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
public static void main(String[] args) throws IOException {
	File file =new File("day2.txt");
	BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
	out.write("abcdefg".getBytes());
	out.close();
	
	BufferedInputStream in =new BufferedInputStream(new FileInputStream(file));
	byte[] bytes =new byte[4];
	int len = -1;
	while((len = in.read(bytes))!= -1){
		System.out.println(new String(bytes,0,len));
	}
	
	in.close();
}
}
