package java_01_hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Poem_main_test1 {
	static HashMap<String,Poem> map=new HashMap<String,Poem>();

public static void main(String[] args) {
	//1 初始化
	init();
	Scanner input=new Scanner(System.in);
	do{
		System.out.println("请输入诗名");
		String title=input.next();
		if("exit".equals(title))
			break;
		// 2 比较
		if(map.containsKey(title)){
			//3 取出对应value
			Poem p=(Poem)map.get(title);
			//4 判断Poem是否为空
			if(null!=p){
				System.out.println("诗词是"+p.getContent());
			}
		}
		
		else System.out.println("找不到该诗");
		
		
	}while(true);
	
	System.out.println("程序结束");
	
	
}


public static void init(){
	
	Poem p1=new Poem("李白", "静夜思", "举头望明月，低头思故乡...");
	Poem p2=new Poem("李白", "早发白帝城", "两岸猿声啼不住，轻舟已过万重山...");
	Poem p3=new Poem("李白", "赠孟浩然", "高山安可仰，徒此揖清芬...");
	
	map.put(p1.getTitle(), p1);
	map.put(p2.getTitle(), p2);
	map.put(p2.getTitle(), p2);
}
}
