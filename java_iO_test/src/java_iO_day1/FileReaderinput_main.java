package java_iO_day1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReaderinput_main {
public static void main(String[] args) throws IOException {
	
	File file =new File("123.txt");
	
	Writer reader =new FileWriter(file);
	
	/*写入字符数组*/
	reader.write(new char[]{'a','b','c'});
	/*传入整数 通过ASI 在文件里写入对应的字符*/
	reader.write(68);
	/*写入字符串*/
	reader.write("fgh");
	/*写入字符串的某一部分*/
	reader.write("ijklmn", 0, 3);
	
	 reader.close();
}
}
