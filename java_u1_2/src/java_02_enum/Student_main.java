package java_02_enum;

import java.util.Random;

public class Student_main {
public static void main(String[] args) {
	//Student s=new Student();
	//s.setCourse(Course.U1);
	Course c=Course.U1;
	show(c);
	int a= (int)(Math.random()*30+1);
	System.out.println(a);
}
public static void show(Course c){
	switch(c){
	case U1:System.out.println("java编程");
	break;
	case U2:System.out.println("iOS编程");
	break;
	case U3:System.out.println("c编程");
	break;
	}
}

}
