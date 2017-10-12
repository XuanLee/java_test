package java_iO_day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class outputStream_main {
public static void main(String[] args) throws Exception {

	//1.创建目标源
	File file =new File("abctest.txt");
	System.out.println(file.isFile());
	//2.创建流 输出流
	FileOutputStream out =new FileOutputStream(file); 
	//3.操作
	/*把数字对应的ASI码写入*/
	out.write(65);
	
	/*传入一个byte数组*/
	byte [] b=new byte[]{66,67,68,69};
	out.write(b);
	
	/*case1：传入byte数组 case2:偏移量(index) case3 从偏移量截取的长度*/
	out.write(b, 0, 2);
	//4.关闭
	out.close();
}
}
