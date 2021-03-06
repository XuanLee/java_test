package java_02_Landlords;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import java_01_Comparable_sort.Student;

/*
 * 把集合这块，我们做个小练习，模拟斗地主洗牌发牌
功能：按照斗地主的规则，完成洗牌、发牌的动作。
具体规则：
	1. 组装54张扑克牌
    2. 将54张牌顺序打乱
	3. 三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
	4. 查看三人各自手中的牌（按照牌的大小排序）、底牌

并且看牌的时候扑克牌从大到小的摆放顺序：大王,小王,2,A, K, Q, J, 10, 9,8,7,6,5,4,3
                                   17 ,16 ,15 14 13 12 11 10                               
 */
public class L_main {
	
	/**总牌数*/
	static 	ArrayList<Integer> list=new ArrayList<Integer>();
	

	/**a的牌*/
	static ArrayList<Integer> aCards=new ArrayList<Integer>();
	/**b的牌*/
	static ArrayList<Integer> bCards=new ArrayList<Integer>();
	/**c的牌*/
	static ArrayList<Integer> cCards=new ArrayList<Integer>();
	/**底牌*/
	static ArrayList<Integer> bottomCards=new ArrayList<Integer>();

public static void main(String[] args) {

		// 1.组装牌
		initList();
		
		// 遍历
		traverse();
		// 2.准备洗牌
		System.out.println("请输入洗牌次数");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		setoutShuffle(count);
		
		// 3.发牌
		deal();
		
		// 4.查看a b c的牌
		lookCards();
}
/** 看牌*/
public static void lookCards(){
	//排序
	//API上说这个方法返回一个比较器，它强行逆转实现了 Comparable 接口的对象 collection 的自然顺序。
	Collections.sort(aCards,Collections.reverseOrder());
	Collections.sort(bCards,Collections.reverseOrder());
	Collections.sort(cCards,Collections.reverseOrder());
	//Collections.sort(aCards);	
//	Collections.sort(bCards);
//	Collections.sort(cCards);
	
	System.out.println("a的牌为");
	Format(aCards);
	System.out.println("b的牌为");
	Format(bCards);
	System.out.println("c的牌为");
	Format(cCards);
	System.out.println("底牌为");
	Format(bottomCards);
}

/**格式化牌*/
public static void Format(ArrayList<Integer> arrayList){
		for (int a : arrayList) {
			if (a == 11) {
				System.out.print("J" + " ");
			} else if (a == 12) {
				System.out.print("Q" + " ");

			} else if (a == 13) {
				System.out.print("K" + " ");

			} else if (a == 14) {
				System.out.print("A" + " ");
			} else if (a == 15) {
				System.out.print("2" + " ");

			} else if (a == 16) {
				System.out.print("小王" + " ");

			} else if (a == 17) {
				System.out.print("大王" + " ");
			} else
				System.out.print(a + " ");
		}
		System.out.println();
}

/**发牌*/
public static void deal(){
	for(int i=0;i<51;i++){
		if(i%3==0)
			aCards.add(list.get(i));
		if(i%3==1)
			bCards.add(list.get(i));
		if(i%3==2)
			cCards.add(list.get(i));
	}
}
/**组装牌*/
public static void initList(){
		for (int j = 0; j < 4; j++) {
			for (int i = 3; i <= 15; i++) {
				list.add(i);
			}
		}
		list.add(16);
		list.add(17);
}
/**遍历*/
public static void traverse(){
		for (int i = 0; i < 54; i++) {
			if (i % 13== 0)
				System.out.println();
			System.out.print(list.get(i)+",");
		}
		System.out.println();
}
/**准备洗牌*/
public static void  setoutShuffle(int count){
		// 2.0获得随机数
		for (int i = 0; i < count; i++) {
			int num1 = (int) (Math.random() * 54 + 1);
			int num2 = (int) (Math.random() * num1 + 1);
//			System.out.println("第"+(i+1)+"次的随机数" + num1);
//			System.out.println("第"+(i+1)+"次的随机数" + num2);
			shuffle(num2,num1);
		}
		bottomCards.add(list.get(51));
		bottomCards.add(list.get(52));
		bottomCards.add(list.get(53));
}
/**洗牌*/
public static void shuffle(int n,int n1){
	// 2.1 取出集合下标n到n1 添加到tmp集合
	ArrayList<Integer> tmp = new ArrayList<Integer>();
	for (int i = n; i < n1; i++) {
		tmp.add(list.get(i));
	}
	
	// 2.2删除list集合n~n1
	for (int i = n; i < n1; i++) {
		int a1 = list.remove(n);
	//	System.out.println(a1);
	}
	
	//2.3将tmp集合添加到list数组后面
	for(int i=0;i<tmp.size();i++){
		list.add(tmp.get(i));
		}
	//traverse();
	}
}