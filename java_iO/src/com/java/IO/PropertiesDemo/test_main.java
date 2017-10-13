package com.java.IO.PropertiesDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

public class test_main {
public static void main(String[] args) throws IOException {
	File file =new File("/Users/lee/Desktop/LXDB.propertiest");
	//配置文件
	Properties pro =new Properties();
	InputStream in = new FileInputStream(file);
//Properties  String = String
	pro.load(in);
	System.out.println(pro.getProperty("age"));
	System.out.println(pro.getProperty("name"));
}
}
