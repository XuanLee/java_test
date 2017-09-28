package LX_Animal;

public class Cat extends Animal implements ITerrestrial{
	private String name;
	private int legNum;
	private String shoutStr;
	public String getShoutStr() {
		return this.shoutStr;
	}
	public void setShoutStr(String shoutStr) {
		this.shoutStr = shoutStr;
	}
	public Cat(String name, int legNum,String shoutStr) {
		super(name);
		this.name=name;
		this.legNum=legNum;
		this.shoutStr=shoutStr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public int getLegNum() {
		return legNum;
	}
	
	public void setLegNum(int legNum) {
		this.legNum=legNum;
	}
	public void shout(String shoutStr){
		System.out.println(shoutStr);
		
	}

			
}
