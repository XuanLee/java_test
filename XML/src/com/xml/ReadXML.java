package com.xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ReadXML {
public static void main(String[] args) {
	//DOM4J提供解析工具
	SAXReader saxReader = new SAXReader();
	
	try {
		//1.获取doucment文档对象，加载路径
		Document doc = saxReader.read("XML/Student.xml");
		
		//2.拿到父节点
		Element root = doc.getRootElement();
		
		//3.拿到父节点下面所有的子节点
		List<Element> list = root.elements();
		
		//4.拿到所有元素
		for (Element els : list) {
			//4.1获得student元素
			if("student".equals(els.getName())){
				Element name = els.element("name");
				System.out.println(name.getText());
				
				Element age = els.element("age");
				System.out.println(age.getText());
				
				Element address = els.element("address");
				System.out.println(address.getText());
			}
		}
		
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
