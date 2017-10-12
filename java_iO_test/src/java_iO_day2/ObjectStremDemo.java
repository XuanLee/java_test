package java_iO_day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * 序列化细节 
 * 1 有些不想序列化的遍历可以加transient 关键字
 * 2.假如将某个类序列化，可以随着版本升级，在类里面又添加新的字段 此时反序列化会报错误
 * 而造成了对象反序列化因为版本不兼容而失败的问题
 * 解决 ：在类中提供一个固定的serialVersionUI
 */
public class ObjectStremDemo {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	File file =new File("person.txt");
	fun2(file);
	
}

//	序列化
//  将java中的对象数据 序列化 成 计算机能识别的二进制码 用于网络传输
	static void fun1(File file) throws FileNotFoundException, IOException{
		ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(file));
		out.writeObject(new Person(11, "lx"));
		out.close();
	}
	
//反序列化
// 把磁盘文件中的对象数据或者把网络节点上的对象数据,恢复成Java对象的过程.
	static void fun2(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in =new ObjectInputStream(new FileInputStream(file));
		Person p=(Person)in.readObject();
		System.out.println(p.toString());
		in.close();
		
	}
}
