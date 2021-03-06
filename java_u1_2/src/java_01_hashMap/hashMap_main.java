package java_01_hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Condition;

public class hashMap_main {
public static void main(String[] args) {
	
	HashMap map=new HashMap();
	
	//添加
	map.put("班长", "熊二");
	map.put("学委", "张三");
	map.put("体委", "李四");
	map.put("纪委", "王五");

	//获取
	String f1=(String)map.get("班长");
	System.out.println("班长："+f1);
	
	//设置
	map.put("班长", "熊大");
	String f2=(String)map.get("班长");
	System.out.println("班长换届："+f2);

	//删除 会返回旧值
	String f3=(String)map.remove("班长");
	System.out.println("旧值:"+f3);
	
	String f4=(String)map.get("班长");
	System.out.println("删除后"+f4);
	
	//判断有没有key
 	boolean b1= map.containsKey("学委");
 	
	//判断有没有value
 	boolean b2=map.containsValue("李四");
 	System.out.println("有没有学委key"+b1);
 	System.out.println("有没有李四value"+b2);
 	
 	//取出所有key
 	Set s=map.keySet();
 	
 	Iterator it= s.iterator();
	while(it.hasNext()){
		String str=(String)it.next();
		System.out.println("所有key"+str);
	}
	
 	Collection c= map.values();
	Iterator it1= c.iterator();
	while(it1.hasNext()){
		String str=(String)it1.next();
		System.out.println("所有value"+str);
	}
	
	
	
	
	
	
}
}
