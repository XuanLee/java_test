package java_iO_day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWirte_main {
public static void main(String[] args) throws IOException {
	File file =new File("day2.txt");
	BufferedWriter writer =new BufferedWriter(new FileWriter(file));
	
	writer.write("锄禾日当午");
	writer.newLine();
	writer.write("汗滴禾下土");
	writer.newLine();
	writer.write("谁知盘中餐");
	writer.newLine();
	writer.write("粒粒皆辛苦");
	writer.close();
	
	BufferedReader reder =new BufferedReader(new FileReader(file));
	char chars[] =new char[6];
	int str = -1;
	while((str=reder.read(chars))!=-1){
		System.out.print(new String(chars,0,str));
	}
	
//	//readLine()返回一行字符串
//	char chars[] =new char[6];
//	String str ="";
//	while ((str=reder.readLine())!=null){
//		System.out.println(str);
//	}
	
	reder.close();
	
	
	
	
	
}
}
