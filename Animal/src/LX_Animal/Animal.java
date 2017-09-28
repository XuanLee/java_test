package LX_Animal;

public abstract class Animal {
	private String name;
	private String shoutStr;
	public String getShoutStr() {
		return shoutStr;
	}

	public void setShoutStr(String shoutStr) {
		this.shoutStr = shoutStr;
	}
	public Animal(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void shout(String shoutStr){
		System.out.println(shoutStr);
	}
}
