package java_01_Comparable_sort;

public class Student implements Comparable{
	private int age;
	private String name;
	private int score;
	private int number;
	public Student(int age, String name, int score, int number) {
		this.age = age;
		this.name = name;
		this.score = score;
		this.number = number;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(number+","+name+","+age+",");
		return super.toString();
	}
	

	public int compareTo(Object o) {
		if(!(o instanceof Student)){
			return 0;
		}
		Student s=(Student)o;
		if(this.number>s.number)
		return -1;
		else 
		return 1;	
	}
	
	
//	public int compareTo(Student o) {
//		Student s=o;
//		if(this.number>s.number)
//		return 1;
//		else 
//		return -1;	
//	}

	
}
