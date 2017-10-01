package java_02_String_split;

public class split_main {
public static void main(String[] args) {
	String s="长亭外 古道边 芳草碧满天";
	String[] sArray=s.split(" ");
	
	for(String tmp : sArray){
		System.out.println(tmp);
		
	}
	
	
}
}
