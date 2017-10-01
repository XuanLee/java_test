package java_02_StringBuffer_test;

public class Good {
	public Good(String name, double prise) {
		super();
		this.name = name;
		this.prise = prise;
	}
	private String name;
	private double prise;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrise() {
		return prise;
	}
	public void setPrise(double prise) {
		this.prise = prise;
	}
}
