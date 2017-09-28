package java_02_danli;

public class Person {
	private int age=1;
//	//懒汉式
//	private static Person p=null;
//	public static Person getP() {
//		if (p == null) {
//			p = new Person();
//		}
//		return p;
//	}
	
	//懒汉式
	private static Person p=new Person();
	public static Person getP() {
		return p;
	}
	
	
	
	public int getAge(){
		return age;
	}
	//禁止外界创建构造方法
	private Person(){
		
	}
}
