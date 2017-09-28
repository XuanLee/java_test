package test_test;

import java.util.Arrays;
import java.util.Scanner;

public class DVD_Main {

public static void main(String[] args) {
	String []name=new String[6];//存储dvd名称
	int [] state=new int [6];//存储dvd借出状态
	int [] date=new int [6];//dvd借出日期
	int [] count=new int [6];//dvd借出次数
	
	name[0]="罗马假日";
	name[1]="风声鹤唳";
	name[2]="浪漫满屋";
	state[0]=1;
	state[1]=0;
	state[2]=0;
	date[0]=1;
	count[0]=15;
	count[1]=12;
	count[2]=30;	
	Scanner in=new Scanner (System.in);
	int num=0;
	do{
		
		while(num>6||num<0){
			System.out.println("输入出错，请重新输入");
			num=in.nextInt();
		}
		if(num==0){
			System.out.println("欢迎使用迷你DVD管理系统");
			System.out.println("---------------------");
			System.out.println("1.新增 DVD");
			System.out.println("2.查看 DVD");
			System.out.println("3.删除 DVD");
			System.out.println("4.借出 DVD");
			System.out.println("5.归还 DVD");
			System.out.println("6.退出 DVD");
			System.out.println("---------------------");
			System.out.println("请选择:");
		}
		num=in.nextInt();
		switch(num){
		case 1:
			System.out.println("-->新增DVD");
			add(name);
			addIntData(count,0);
			state[state.length-1]=0;
			System.out.println("输入0返回");
			break;
		case 2:
			System.out.println("-->查看DVD");
		    check1(name,state,date,count);
			System.out.println("输入0返回");
			break;
		case 3:
			System.out.println("-->删除DVD");
			remove(name,state,date,count);
			System.out.println("输入0返回");
			break;
		case 4:
			System.out.println("-->借出DVD");
			checkOut(name,state,date,count);
			System.out.println("输入0返回");
			break;
		case 5:
			System.out.println("-->归还DVD");
			giveBack(name,state,date,count);
			System.out.println("输入0返回");
			break;
		case 6:break;
		}
	}while(num!=6);
	System.out.println("系统结束");
		return;	
}
	//新增
 public static void add(String name[]){
	System.out.println("请输入DVD名称");
	Scanner in=new Scanner (System.in);
	String str=in.nextLine();	
	for(int i=0;i<name.length;i++){
		if(str.equals(name[i])){
			System.out.println("书名相同");
			return;
		}
		 
	}
	addData(name,str);
	//System.out.println(Arrays.toString(name));
}
	//查看
	public static void check1(String [] name,int state[],int date[],int count[]){
	System.out.println("序号\t名称\t\t状态\t\t借出日期\t\t 借出次数");
	for(int i=0;i<name.length;i++){
				if(name[i] !=null){
					String sta = state[i]==1?"已借出":"可借";
					String Sdate=date[i]==1?"":date[i]+"日";
//				if(date[i]==0)
//					System.out.println((i+1)+"\t"+name[i]+"\t\t"+sta+"\t\t"+"\t\t"+count[i]+"次");
//				else 
					System.out.println((i+1)+"\t"+name[i]+"\t\t"+sta+"\t\t"+date[i]+"日"+"\t\t"+count[i]+"次");
	}
	}
}
	//删除
	public static void remove(String name[],int state[],int date[],int count[]){
		System.out.println("请输入要删除DVD的序号");
		check1(name,state,date,count);
		Scanner in =new Scanner (System.in);
		int location=in.nextInt();		
		location=ArrayIfOperationCorrect(name, location, in,state);
		
		for(int i=location;i<name.length;i++){
			name[i-1]=name[i];
			state[i-1]=state[i];
			date[i-1]=date[i];
			count[i-1]=count[i];
		}
		
		name[name.length-1]=null;
		System.out.println("删除成功");
		
	}
//		
	//借出
	public static void checkOut(String name[],int state[],int date[],int count[]){
		System.out.println("请输入借书的序号");
		check1(name,state,date,count);
		Scanner in=new Scanner (System.in);
		int location=in.nextInt();
		//判断借书操作序号有没有意义		
		location=ArrayIfOperationCorrect(name, location, in,state);
		if(state[location-1]!=1){
		System.out.println("请输入借书日期");
		int riqi=in.nextInt();
		while(riqi>31||riqi<0){
			System.out.println("日期错误,请重新输入");
			riqi=in.nextInt();
		}
		date[location-1]=riqi;
		state[location-1]=1;
		count[location-1]+=1;
		}
		else System.out.println("该书已经借出");
		}
	//归还
	public static void giveBack(String name[],int state[],int date[],int count[]){
	System.out.println("请输入要归还DVD");
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	int index=-1;
	for(int i=0;i<name.length;i++){
		if(str.equals(name[i])){//如果找到了
			index=i;
		}
	}
	if(index==-1){
		System.out.println("没有这本书");
	}
	else{//找到了
	if(state[index]==0){//如果可借
		System.out.println("书籍并没有借出");
	}
	else{//如果没借出
		System.out.println("请输入归还日期");
		int riqi=in.nextInt();
		while(riqi>30){
			System.out.println("日期错误请重新输入");
			riqi=in.nextInt();
		}
		//已经归还
			int a;
			
			a=riqi-date[index];
			
			System.out.println("归还日期"+riqi);
			System.out.println("借书日期"+date[index]);
			System.out.println("应付租金(元)"+a);
		//改租书状态为1
			state[index]=0;
		//借书日期改为0
			date[index]=0;
		}
	}
}
	//给name数组增加一个数
	public static void addData(String name[],String str){
	int index=-1;

	for(int i=0;i<name.length;i++){
		if(name[i]==null){
			index=i;
			break;
		}
	}
	if(index==-1)
		System.out.println("货架已满");
		else 
		name[index]=str;
	
	
}
	//给int数组添加元素
	public static void addIntData(int array[],int a){
	int index=-1;
	for(int i=0;i<array.length;i++){
		if(array[i]==0){
			index=i;
			break;
		}
	}
	if(index==-1)
		System.out.println("没有空值");
	else 
		array[index]=a;
}
	/**
	 * 判断数组操作是否正确
	 * @param name :数组名称
	 * @param location 插入位置
	 */
	public static int ArrayIfOperationCorrect(String name[],int location,Scanner in,int state[]){
		while(location>name.length||location==0||name[location-1]==null||state[location-1]==1){
			System.out.println("输入错误,请重新输入序号");
			location=in.nextInt();
			}
//		while(state[location-1]==1){
//			System.out.println("此书已借出，请重新输入");
//			location=in.nextInt();
//		}
//		while(name[location-1]==null){
//			System.out.println("没有此书，请重新输入序号");
//			location=in.nextInt();
//		}
		return location;
	}
}