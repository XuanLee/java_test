package java_01_Comparable_sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sort_main {
private static ArrayList list;

public static void main(String[] args) {
	list = new ArrayList();
	
	Student s1=new Student(18, "张三", 76, 1);
	Student s2=new Student(13, "李三", 86, 2);
	Student s3=new Student(21, "王三", 79, 6);
	Student s4=new Student(24, "刘三", 91, 5);
	Student s5=new Student(22, "白三", 99, 9);
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);

	
	for(Object o : list){
		Student s=(Student)o;
		s.toString();
	}
	
	//根据序号生序输出
	System.out.println("根据序号生序输出");
	Collections.sort(list);
	
	for(Object o : list){
		Student s11=(Student)o;
		s11.toString();
	}
	
	//查找
	int index=Collections.binarySearch(list, 21);
	System.out.println(index);
	
	
}
}
