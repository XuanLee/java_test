package java_02_StringBuffer_test;

import java.util.Scanner;

//1 2 3 4 5 6 7
//7 4 1  下标上放，
//1,234,567,
// 4 1
public class test_main {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("请输入一个数");
		String str=input.next();
		
		StringBuffer sb=new StringBuffer(str);
		
		for(int i=sb.length()-3;i>0;i=i-3){
			sb.insert(i, ",");
		}
		System.out.println(sb);
	}
}
