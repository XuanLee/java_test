package LX_Animal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LX_input_tool {
	private static Scanner in=new Scanner (System.in);
	//正整数的保护 错误继续输入
	public static int inputInt(){
		int num=-1;
		do{
		try{
	
		 num=in.nextInt();
		}
		catch(InputMismatchException e){
			in.next();
			System.err.println("请输入错误，请输入数字");
			continue;
		}
		if(num==0)
			return num;
		break;
		}while(true);
		
		
		return num;
	}
	
	//输入猫腿 错误继续输入 正确返回正确条数
	public static int inputInt(int AnimallLegNum){
		int num=-1;
		do{
		try{
			System.out.println("请输入正确的猫的条数");
		 num=in
				 .nextInt();
		}
		catch(InputMismatchException e){
			System.err.println("请输入错误，请输入数字");
		}
		if(num==AnimallLegNum)
			break;
		if(num==0)
			return num;
		}while(true);
		return num;
	}
	public static void main(String[] args) {
		int num=inputInt();
	//	int num1=inputInt(4);
		System.out.println(num);
		

	}
}
