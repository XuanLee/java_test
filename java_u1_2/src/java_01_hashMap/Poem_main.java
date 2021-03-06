package java_01_hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Poem_main {
	static HashMap map;
	public static void main(String[] args) {
		//1
		initPoem();
		
		Scanner input=new Scanner (System.in);
		do{
			System.out.println("请输入诗的名称:");
			String title=input.next();
			
			//2 判断是否退出
			if("exit".equals(title)){
				break;
			}
			//3 判断集合里有没有key
			if(map.containsKey(title))
			{
			Poem p =(Poem)map.get(title);
		
			//4 判断poem对象有没有值 避免为空崩溃
			if(null!=p)
				System.out.println("诗词:"+p.getContent());
			else 
				System.out.println("没有找到对应诗词");
			
			}
			else
			{
				System.out.println("没有找到该书");
			}
		}while(true);
		
		System.out.println("退出程序");
		
		
			
	}
	/**初始化诗集*/
	public static void initPoem(){
		map=new HashMap();
		Poem p1=new Poem("李白", "静夜思", "举头望明月，低头思故乡...");
		Poem p2=new Poem("李白", "早发白帝城", "两岸猿声啼不住，轻舟已过万重山...");
		Poem p3=new Poem("李白", "赠孟浩然", "高山安可仰，徒此揖清芬...");

		map.put(p1.getTitle(), p1);
		map.put(p2.getTitle(), null);
		map.put(p3.getTitle(), p3);
	}
}

