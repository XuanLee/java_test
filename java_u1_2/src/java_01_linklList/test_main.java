package java_01_linklList;

import java.util.LinkedList;

import java_01_arrayList.Employee;

public class test_main {
public static void main(String[] args) {

	//创建集合对象
	LinkedList list=new LinkedList();
	
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
		
		
//		//离职
//		list.remove(e1);
//		//离职最后一个
//		list.removeLast();
		
		//添加
		list.add(e1);
		//添加对象到最前面一个
		list.addFirst(e4);
		
		
		
		
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
