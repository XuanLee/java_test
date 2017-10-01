package java_02_StringBuffer_test;

import java.util.ArrayList;

import java.util.Scanner;


public class Shopping {
	static 	ArrayList<Good> arraylist=new ArrayList<Good>();

public static void main(String[] args) {
	
	init();
	showMenu();

	
	
	System.out.println("请输入你要批发的商品序号");
	Scanner input=new Scanner (System.in);
	int num=input.nextInt();
	System.out.println("请输入你要批发的数量");
	int count=input.nextInt();
	Good g=arraylist.get(num-1);
	double prise=g.getPrise()*count;
	System.out.println("您需要付款"+prise);
	
}
public static void init(){
	Good g1=new Good("电风扇", 123.23);
	Good g2=new Good("洗衣机", 4500.0);
	Good g3=new Good("电视机", 8800.9);
	Good g4=new Good("冰箱", 5000.86);
	Good g5=new Good("空调机", 4456.0);

	arraylist.add(g1);
	arraylist.add(g2);
	arraylist.add(g3);
	arraylist.add(g4);
	arraylist.add(g5);	
}
public static void showMenu(){
	System.out.println("*********欢迎进入商品批发城*********");
	System.out.println("编号\t商品\t序号");
	for(int i=0;i<arraylist.size();i++){
		Good g1=arraylist.get(i);
		System.out.println((i+1)+"\t"+g1.getName()+"\t"+doPrice(g1.getPrise()));
	}
	
	System.out.println("**********************************");
	
	
}

public static String doPrice(double price){
	
	//1 3 4 5 6 2 . 2 3
	//6 3 
	StringBuffer sb=new StringBuffer();
	sb.append(price);
	int length=sb.length();
	int index=sb.indexOf(".");
	
	for(int i=index-3;i>0;i=i-3)
	{
		sb.insert(i, ",");
	}
	String str=sb.toString();
	
	return str;
}
}
