package java_01_HashSet;

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
	
	
//	@Override
//	public int hashCode() {
//		System.out.println("hashCode");
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((date == null) ? 0 : date.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + number;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equals");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (age != other.age)
//			return false;
//		if (date == null) {
//			if (other.date != null)
//				return false;
//		} else if (!date.equals(other.date))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (number != other.number)
//			return false;
//		return true;
//	}
	
}
