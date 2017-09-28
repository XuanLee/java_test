package LX_Animal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Animal_main {
	
	private static Scanner input=new Scanner(System.in);
	private static String str="";
	private static Animal[] animal=new Animal[3];
	private static int num=-1;
public static void main(String[] args) {
	//1.初始化数组
	initArrays();	
	do{
	//2.加载动物信息
	load();
	//3.调用test类的静态方法，判断输入是否为数字，不为数字抛异常，并且重新输入
	System.out.println("是否要修改数据，按0进行操作，其他任意数字退出");
	num=LX_input_tool.inputInt();
	if(num==0){
		try{
	//4.修改动物信息		
			modify();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	else 
		break;
	}while(true);
	
	System.out.println("程序结束");
}



/**初始化动物数组*/
public static void initArrays(){
	Animal cat=new Cat("加菲猫",4,"喵喵喵……");
	animal[0]=cat;
	Animal duck=new Duck("唐小鸭",2,"嘎嘎嘎……");
	animal[1]=duck;
	Animal dolphin=new Dolphin("海豚奇奇", 0,"海豚叫……");
	animal[2]=dolphin;
}

/**输出动物信息*/
public static void load(){
	System.out.println("动物名字"+"\t\t"+"腿的条数\t\t"+"动物叫");
	for(int i=0;i<animal.length;i++){
		int legNum=0;
		if(animal[i] instanceof ITerrestrial){
			ITerrestrial animalS=(ITerrestrial)animal[i];
			legNum=animalS.getLegNum();
		}
		System.out.print(animal[i].getName()+"\t\t"+legNum+"\t\t");
		
		String str1=animal[i].getShoutStr();
		animal[i].shout(str1);
	}
}

/**修改动物信息*/
public static void modify() throws Exception{
	System.out.println("请选择修改那种动物(猫，鸭，海豚)");
	str=input.next();
	switch(str){
	case "猫":{
		System.out.println("请输入猫的名称");
		str=input.next();
		System.out.println("请输入猫的叫声");
		String shout=input.next();
		animal[0].setShoutStr(shout);
		 if (animal[0] instanceof ITerrestrial) {
			 System.out.println("请输入猫腿的条数");
				num=LX_input_tool.inputInt(4);
				if(num==4){
				ITerrestrial cat=(ITerrestrial)animal[0];
				cat.setLegNum(num);
				animal[0].setName(str);
				}
				else throw new Exception("猫的腿只能有四条");
			}
		break;
	}
	case "鸭":{
		System.out.println("请输入鸭的名称");
		str=input.next();
		System.out.println("请输入鸭的叫声");
		String shout=input.next();
		animal[0].setShoutStr(shout);
		if (animal[1] instanceof ITerrestrial) {
			 System.out.println("请输入鸭腿的条数");
				num=LX_input_tool.inputInt();
				if(num==2){
				ITerrestrial Duck=(ITerrestrial)animal[1];
				Duck.setLegNum(num);
				animal[1].setName(str);
				}
				else throw new Exception("鸭的腿只能有两条");
			}
		break;
	}
	case "海豚":{
		System.out.println("请输入海豚的名称");
		str=input.next();
		animal[2].setName(str);
		System.out.println("请输入海豚的叫声");
		String shout=input.next();
		animal[2].setShoutStr(shout);
		if (animal[2] instanceof ITerrestrial) {
			 System.out.println("请输入海豚腿的条数");
				num=input.nextInt();
				if(num==0){
				ITerrestrial Dolphin=(ITerrestrial)animal[2];
				Dolphin.setLegNum(num);
				}
//				else throw new Exception("的腿只能有两条");
			}
		else System.out.println("海豚没有腿");
		break;
	}
	default :throw new Exception("输入出错");
	}
	}
}
