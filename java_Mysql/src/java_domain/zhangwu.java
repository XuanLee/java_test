package java_domain;

public class zhangwu {
	private int id;
	private String name;
	private double money;
	public zhangwu(int id, String name, double money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	public zhangwu(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "zhangwu [id=" + id + ", name=" + name + ", money=" + money
				+ "]";
	}
	
}
