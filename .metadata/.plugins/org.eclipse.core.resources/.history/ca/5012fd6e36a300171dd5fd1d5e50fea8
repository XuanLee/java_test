package java_02_Random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 红球33选6 篮球16选一
 */
public class test_main {
	static int [] redBall=new int[6];
	static int tmp=0;
	static int blueBall=0;
	static HashSet setArray=new HashSet();

	public static void main(String[] args) {
		
		//1.数组做法
		//array();
		//2.hasSet做法
			hasSet();

		
		
	}
	
	public static void hasSet(){
		while(setArray.size()<6){
			 tmp= (int) (Math.random() * 33 + 1);
			 setArray.add(tmp);
		}
		Iterator It= setArray.iterator();
		while(It.hasNext()){
			System.out.print(It.next()+" ");
		}
		 blueBall=(int) (Math.random() * 16 + 1);
		System.out.println("+"+blueBall);
	}
	public static void array(){
		for (int i = 0; i < redBall.length; i++) {

			do {
				 tmp = (int) (Math.random() * 33 + 1);
			} while (juge(tmp));
			redBall[i]=tmp;
		}
		 blueBall=(int) (Math.random() * 16 + 1);
		 for(int i : redBall){
			 System.out.print(i+" ");
		 }
		System.out.println("+"+blueBall);
	}
	
	public static boolean juge(int tmp) {
		for(int i=0;i<redBall.length;i++){
			if(tmp==redBall[i])
				return true;
		}
		return false;
	}
}
