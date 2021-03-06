package java_01_HashSet;

import java.util.HashSet;
import java.util.Iterator;

import java_01_arrayList.Employee;

public class test_main {
public static void main(String[] args) {
	
	HashSet set=new HashSet();
	
	//创建员工对象
	Employee e1=new Employee(1, "熊二", 21, "2014.8.13");
	Employee e2=new Employee(2, "张三", 24, "2015.4.12");
	Employee e3=new Employee(3, "李四", 25, "2010.11.22");
	Employee e4=new Employee(4, "王五", 22, "2011.12.1");
	Employee e44=new Employee(4, "王五", 22, "2011.12.1");

	
	
	set.add(e4);
	set.remove(e3);
	
	boolean b= set.add(e4);
	
	System.out.println(e4.hashCode()+","+e4.hashCode());
	
	System.out.println(b);
	
	Iterator it= set.iterator();
	
	while(it.hasNext())
	{
	Employee e=(Employee)it.next();
	System.out.println(e.getName());
	}
	
	
	//因为Collection中有iterator方法，所以每一个子类集合对象都具备迭代器
	Iterator iterator=set.iterator();
	//当有元素时返回true
	while(iterator.hasNext()){	
		Employee e=(Employee)iterator.next();
		System.out.println(e.getName());
	}
		
	
	
	
	
	
	
	
	
	
	
	

}
}
