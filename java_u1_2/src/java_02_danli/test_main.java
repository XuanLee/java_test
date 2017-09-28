package java_02_danli;

public class test_main {
/*
 * 1、单例类确保自己只有一个实例。
  2、单例类必须自己创建自己的实例。
3、单例类必须为其他对象提供唯一的实例。
 */
	public static void main(String[] args) {
		Person p=Person.getP();
		Person p1=Person.getP();
		Person p2=Person.getP();
		Person p3=Person.getP();

		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}
}
