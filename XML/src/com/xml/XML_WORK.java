package com.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XML_WORK {
public static void main(String[] args) throws Throwable {
	
	//createXML();
	//writer();
	
	//1.获取xml
	SAXReader saxReader = new SAXReader();
	Document doc = saxReader.read("XML/cars.xml");
	//2.拿到父节点
	Element root = doc.getRootElement();
	//3.遍历子节点
	List<Element> list = root.elements();
	for (Element els : list) {
		//3.1获得car元素
		if("car".equals(els.getName())){
			Element price = els.element("price");
			price.setText("88W");
			System.out.println(price.getText());
		}
	}
	saveDocument(doc, new File("X ML/cars.xml"));
}
/**
* 把改变的domcument对象保存到指定的xml文件中
* @author chenleixing
* @throws IOException 
*/
public static void saveDocument(Document document,File xmlFile) throws IOException{
	Writer osWrite=new OutputStreamWriter(new FileOutputStream(xmlFile));//创建输出流
	OutputFormat format = OutputFormat.createPrettyPrint();  //获取输出的指定格式  
	format.setEncoding("UTF-8");//设置编码 ，确保解析的xml为UTF-8格式
	XMLWriter writer = new XMLWriter(osWrite,format);//XMLWriter 指定输出文件以及格式  
	writer.write(document);//把document写入xmlFile指定的文件(可以为被解析的文件或者新创建的文件)  
	writer.flush();
	writer.close();

}


/**
* 对指定的节点属性进行删除、添加、修改
* @author chenleixing
*/
public void editAttribute(Element root,String nodeName){

//获取指定名字的节点，无此节点的会报NullPointerException,时间问题不做此情况的判断与处理了
	Element node=root.element("user");
	Attribute attr=node.attribute("editor");//获取此节点指定的属性,无此节点的会报NullPointerException
	node.remove(attr);//删除此属性

	Attribute attrDate=node.attribute("date");//获取此节点的指定属性
	attrDate.setValue("更改");//更改此属性值

	node.addAttribute("add","增加");//添加的属性
}

private static void writer() {

	//DOM4J提供解析工具
		SAXReader saxReader = new SAXReader();
		
		try {
			//1.获取doucment文档对象，加载路径
			Document doc = saxReader.read("XML/cars.xml");
			
			//2.拿到父节点
			Element root = doc.getRootElement();
			
			//3.拿到父节点下面所有的子节点
			List<Element> list = root.elements();
			
			//4.拿到所有元素
			for (Element els : list) {
				//4.1获得student元素
				if("car".equals(els.getName())){
					Element name = els.element("name");
					System.out.println(name.getText());
					
					Element age = els.element("price");
					System.out.println(age.getText());		
				}
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

private static void createXML() throws Exception {
	// TODO Auto-generated method stub
	//1.使用dom4j的DocumentHelper类创建document文档
		Document doc = DocumentHelper.createDocument();
		
		//2.DocumentHelper创建元素,作为使用并添加元素
		Element rootElement = DocumentHelper.createElement("cars");
		
		//3.在rootElement根节点下添加元素
		Element student = rootElement.addElement("car");
		//3.1在student目录下添加元素
		Element nameE = student.addElement("name");
		Element ageE = student.addElement("price");
		
		//4.给子元素设置值
		nameE.setText("奔驰");
		ageE.setText("33W");

		//5.将元素结构放入document模型里
		doc.setRootElement(rootElement);
		
		try {
			//1 创建流，注入地址
			FileOutputStream outPut = new FileOutputStream("XML/cars.xml");
			//创建美化工具并输入指定格式 换行
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			format.setIndent("      ");
			
			//2.使用dom4j提供的xmlWrither方法将Document文档写进去
			XMLWriter writer = new XMLWriter(outPut, format);
			writer.write(doc);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
