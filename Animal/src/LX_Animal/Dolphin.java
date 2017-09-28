package LX_Animal;

public class Dolphin extends Animal{

	private String name;
	private int legNum=0;
	private String shoutStr;
	public String getShoutStr() {
		return shoutStr;
	}
	public void setShoutStr(String shoutStr) {
		this.shoutStr = shoutStr;
	}
	public Dolphin(String name, int legNum,String shoutStr) {
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
	public void shout(String str){
		System.out.println(str);
	}
	public int getLegNum() {
		return legNum;
	}
}
