package java_02_String_passworld;

import java.util.Scanner;

public class test_main {
	static 	String tmp="";
	static 	Scanner input =new Scanner(System.in);
public static void main(String[] args) {
		String userName="";
		String passWorld="";
	
		System.out.println("请输入用户名（长度不小于3）");
		userName=input.next();
		while(userName.length()<3){
			System.out.println("请重新输入用户名");
			userName=input.next();
		}
		System.out.println("请输入密码（长度大于6）");
		passWorld=input.next();
		while(passWorld.length()<6){
			System.out.println("密码长度不对，请重新输入密码");
			passWorld=input.next();	
		}
		System.out.println("请输入再次输入密码");
		tmp=input.next();
		while(!(passWorld.equals(tmp))){
		System.out.println("与第一次密码不同，请重新输入");
		tmp=input.next();	
		}
		System.out.println("登录成功");
}


//public static Boolean panduan(String userName,String passWorld,String tmp){
//	if(userName.length()<3){
//		System.out.println("长度要大于三");
//		return true;
//	}
//	
//	if(!(passWorld.equals(tmp))||passWorld.length()<6){
//		System.out.println("请重新输入密码");
//		return true;
//	}
//	return false;
//}
}