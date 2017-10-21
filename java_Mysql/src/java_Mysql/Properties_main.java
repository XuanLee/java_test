package java_Mysql;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Properties_main {
public static void main(String[] args) throws Exception {
	//因为最后properties要到bin目录下 所以不能写在scr相对路径
	InputStream in = Properties_main.class.getClassLoader().getResourceAsStream("config.properties");
	Properties pr =new Properties();
	pr.load(in);
	String className = pr.getProperty("driverClass");
	String url = pr.getProperty("url");
	String userName = pr.getProperty("username");
	String passworld = pr.getProperty("passworld");
	System.out.println(className);
	System.out.println(url);
	System.out.println(userName);
	System.out.println(passworld);
	
	}
}
