package java_01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class test_main {
	private static 	ArrayList list= new ArrayList();
public static void main(String[] args) {

	//创建ArrayList对象
//	ArrayList list= new ArrayList();
	
	//创建员工对象
	Employee e1=new Employee(1, "熊二", 21, "2014.8.13");
	Employee e2=new Employee(2, "张三", 24, "2015.4.12");
	Employee e3=new Employee(3, "李四", 25, "2010.11.22");
	Employee e4=new Employee(4, "王五", 22, "2011.12.1");

	//将员工对象添加到list
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	//输出
	print();
	//删除list index 对象
	//list.remove(0);
	
	//插入list对象 index：新的对象 
	//list.set(0, e4);
	//print();
	
	//判断集合是否为空
	//list.isEmpty();
	
	//判断集合有没有某个对象
	//list.contains(e4);
	
	
	//删除list所有对象
	list.clear();
	
	
}

public static void print(){

	System.out.println("--------------普通for输出------------------");

	//普通for输出
	for(int i=0;i<list.size();i++){
		Employee  e =(Employee)list.get(i);
		System.out.println(e.getNumber()+" "+e.getName()+","+e.getAge()+","+e.getDate());
	}
	System.out.println("--------------增强for输出------------------");
	//增强for输出
	for(Object o : list){
		Employee e=(Employee)o;
		System.out.println(e.getNumber()+" "+e.getName()+","+e.getAge()+","+e.getDate());
	}
}




}
