package java_iO_day2;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * transient
	 */
	private  static final long serialVersionUID = 1L;
	private int age;
	private String name;
	private int sex;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
}
