package java_iO_day3;

public class test_main1 {
	// abcdg // cdg
public static void main(String[] args) {
	String str ="abcdg";
	String[] charArray =str.split("");
	String str1 = "adg";
	String [] str1Array = str1.split("");
	int index=0;
	for(int i=0;i<charArray.length;i++){
		if(str1Array[0].equals(charArray[i])){
			index=i;
		}
	}
	//截取str从index到str1的长度
	String sunStr=str.substring(index, index+str1.length());
	System.out.println(sunStr);
	if(sunStr.equals(str1)){
		System.out.println("包含");
	}
	else {
		System.out.println("不包含");
	}
	
	
	
}
}
