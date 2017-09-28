package LX_Animal;

public class Duck extends Animal implements ITerrestrial{
	private String name;
	private int legNum;
	private String shoutStr;
	public String getShoutStr() {
		return shoutStr;
	}
	public void setShoutStr(String shoutStr) {
		this.shoutStr = shoutStr;
	}

	public String getName() {
		return name;
	}
	public int getLegNum() {
		return legNum;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public void setLegNum(int legNum){
		this.legNum=legNum;
	}
	public Duck(String name, int legNum,String shoutStr) {
		super(name);
		this.name=name;
		this.legNum=legNum;
		this.shoutStr=shoutStr;
	}

	public void shout(String str){
		System.out.println(str);
	}
}
