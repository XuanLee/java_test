package java_02_String_endwith;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LX_test_main {
	static Scanner input= new Scanner (System.in);

	//hellohe
	//0123456
	//he
	//取出he的个数
	public static void main(String[] args) {
		int count=0;
		System.out.println("请输入字符串");
		String str=input.next();
		
		System.out.println("请输入字符");
		String str1=input.next();
		
		count=StringCount(str,str1);
		System.out.println(str1+"出现的次数是"+count);

	}
	
	
	//返回第2个字符出现在第1个字符串的个数
	public static int StringCount(String str,String str1){
		int count=0;
		//将第一个字符串转换为数组
		String strArray[]=str.split("");
		// 	取出第二个字符串的第一个字符
		String fristChar=str1.charAt(0)+"";
		//定义一个临时集合装截取好的字符串
		ArrayList<String> arraylist=new ArrayList<String>();
		String tmp = "";
		for (int i = 0; i < strArray.length; i++) {
//			System.out.println("下标是 "+i+"数组长度是 "+strArray.length+"取出字符串长度是"+char1.length()+"截取范围是0<"+(strArray.length-char1.length()+1));
			if (strArray[i].equals(fristChar)) {
				if(i<strArray.length-str1.length()+1)
				{
				tmp = str.substring(i, i+str1.length());
				arraylist.add(tmp);
				}
			}
		}
		for(String s : arraylist){
			System.out.println(s);
			if(s.equals(str1))
				count++;
		}
		return count;
	}
	
	
	
	
	
	
	
	public static void test1(){
		Boolean b=false;
		while(!b){
			System.out.println("请输入文件");
			String str=input.next();
			 b =str.endsWith(".java");
			
		}
		
		 System.out.println("正确");
	}
}
