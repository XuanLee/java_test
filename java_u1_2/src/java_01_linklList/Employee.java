package java_01_linklList;

public class Employee {
	private String name;
	private int number;
	private String date;
	private int age;
	public Employee(int number, String name, int age, String date) {
		this.age = age;
		this.name = name;
		this.number = number;
		this.date = date;
	}
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
