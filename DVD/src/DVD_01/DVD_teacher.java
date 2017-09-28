package DVD_01;

import java.util.Scanner;

public class DVD_teacher {
	public static void main(String[] args) {
		// 数据初始化
		String[] name = new String[6];
		boolean[] state = new boolean[6];
		int[] date = new int[6];
		int[] count = new int[6];

		name[0] = "罗马假日";
		name[1] = "风声鹤唳";
		name[2] = "浪漫满屋";

		state[0] = false;// 已借出
		state[1] = true; // 可借
		state[2] = true;

		date[0] = 1;

		count[0] = 15;
		count[1] = 12;
		count[2] = 30;
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.println("欢迎使用迷你DVD管理系统");
			System.out.println("----------------------");
			System.out.println("1.新增 DVD");
			System.out.println("2.查看 DVD");
			System.out.println("3.删除 DVD");
			System.out.println("4.借出 DVD");
			System.out.println("5.归还 DVD");
			System.out.println("6.退出 DVD");
			System.out.println("----------------------");
			System.out.println("请选择：");
			num = input.nextInt();
			while (num > 6 || num < 1) {
				System.out.println("输入错误，请输入（1-6）");
				num = input.nextInt();
			}
			switch (num) {
			case 1:
				System.out.println("-->新增 DVD");
				String name_add = input.next();
				// 先判断dvd数组是否已满
				if (name[name.length - 1] != null) {
					System.out.println("数据已满!");
					break;
				}
				// 判断下dvd数组是否有添加的dvd信息
				int index_same = -1;
				int count_same = 0;
				do {
					index_same = -1;
					for (int i = 0; i < name.length; i++) {
						if (name_add.equals(name[i])) {
							// 说明找到相同dvdname
							index_same = i;
							break;
						}
					}

					if (index_same != -1 && count_same > 4) {
						System.out.println("输入已存在dvd超过五次,退出!");
						break;
					}

					if (index_same != -1) {
						System.out.println("已有该dvd，不能添加!请重新输入:");
						name_add = input.next();
						// 每输入一次 就累加一次
						count_same++;
					}

				} while (index_same != -1);

				if (index_same != -1 && count_same > 4) {
					break;
				}

				int index_add = -1;
				// 找空位置 下标
				for (int i = 0; i < name.length; i++) {
					if (null == name[i]) {
						index_add = i;
						break;
					}
				}
				if (index_add != -1) {// 新增dvd
					name[index_add] = name_add;
					state[index_add] = true;
					System.out.println("添加" + name_add + "成功!");
				}

				System.out.println("-----------------");

				break;
			case 2:
				System.out.println("-->查看 DVD");
				System.out.println("-----------------");
				System.out.println("序号\t状态\t\t名称\t\t 借出日期\t\t 借出次数");
				for (int i = 0; i < name.length; i++) {
					if (name[i] != null) {
						String sta = !state[i] ? "已借出" : "可借";
						String dat = date[i] == 0 ? " "  : date[i] + "日";
						System.out.println((i + 1) + "\t" + sta + "\t\t"
								+ name[i] + "\t\t" + dat + "\t\t" + count[i]
								+ "次");
					}
				}

				break;
			case 3:
				System.out.println("-->删除 DVD");
				// 如果dvd信息都没有，提示下
				if (null == name[0]) {
					System.out.println("dvd信息为空,无法删除!");
					break;
				}

				// 找删除内容的下标,删除dvd信息
				String name_del = input.next();
				// 申明个变量 找删除dvd内容的下标
				int index_del = -1;
				// 申明个变量 记录删除的次数
				int count_del = 0;
				do {
					// 遍历name数组 找到删除内容的下标 赋值给index_del
					for (int i = 0; i < name.length; i++) {
						if (name_del.equals(name[i])) {
							index_del = i;
						}
					}
					// 超过指定 次数 则返回跳出循环
					if (index_del == -1 && count_del > 4) {
						System.out.println("输入错误次数超过五次,强制退出!");
						break;
					}
					if (index_del == -1) {
						// 没找到删除的内容，给出提示，重新输入
						System.out.println("没找到该dvd,你输入次数已经" + (count_del + 1)
								+ "次，还剩余" + (5 - count_del) + "次,请重新输入:");
						name_del = input.next();
						// 每输入一次，记录一次
						count_del++;// count_del = count_del +1;
					}
				} while (index_del == -1);

				if (index_del != -1) {
					if (state[index_del]) {// state 为true 可借
											// 可以删除dvd
						for (int i = index_del; i < name.length - 1; i++) {
							name[i] = name[i + 1];
							state[i] = state[i + 1];
							date[i] = date[i + 1];
							count[i] = count[i + 1];
						}
						name[name.length - 1] = null;
						state[name.length - 1] = false;
						date[name.length - 1] = 0;
						count[name.length - 1] = 0;
						System.out.println("删除" + name_del + "成功!");
					} else {
						// 不可借状态下，不能删除
						System.out.println("该dvd已经被借出,删除不了!");
					}

				} else {
					System.out.println("没有该dvd,删除不了!");
				}

				System.out.println("-----------------");

				break;
			case 4:
				System.out.println("-->借出 DVD");

				// 如果dvd信息都没有，提示下
				if (null == name[0]) {
					System.out.println("dvd信息为空,无法借出!");
					break;
				}
				String name_lend = input.next();
				int index_lend = -1;
				int count_lend = 0;
				do {
					// 遍历数组找到可借dvd的下标
					for (int i = 0; i < name.length; i++) {
						if (name_lend.equals(name[i])) {
							index_lend = i;
							break;
						}
					}

					if (index_lend == -1) {
						if (count_lend > 4) {
							System.out.println("没找该dvd，输错次数已超过5次！");
							break;

						} else {
							System.out.println("没找到该dvd，请重新输入：");
							name_lend = input.next();
							count_lend++;
						}
					}

				} while (index_lend == -1);

				if (index_lend != -1) {
					if (state[index_lend]) {
						state[index_lend] = false;
						count[index_lend]++;// count[index_lend] =
											// count[index_lend] +1;
						// System.out.println("请输入借出日期：");
						// int day_lend = input.nextInt();
						// while(day_lend<1 || day_lend>31)
						// {
						// System.out.println("应输入的日期(1-31)，请重新输入:");
						// day_lend = input.nextInt();
						// }
						int day_lend;
						do {
							System.out.println("应输入的日期(1-31)，请输入借出日期：");
							day_lend = input.nextInt();
						} while (day_lend < 1 || day_lend > 31);

						date[index_lend] = day_lend;
						System.out.println("借出dvd：" + name_lend + "成功!");

					} else {
						// 已借出
						System.out.println("该dvd：" + name_lend + "已借出!");

					}

				}

				System.out.println("-----------------");

				break;
			case 5:
				System.out.println("-->归还 DVD");
				// 如果dvd信息都没有，提示下
				if (null == name[0]) {
					System.out.println("dvd信息为空,无法归还!");
					break;
				}

				String name_back = input.next();
				int index_back = -1;
				for (int i = 0; i < name.length; i++) {
					if (name_back.equals(name[i])) {
						index_back = i;
						break;
					}
				}

				if (index_back != -1) {
					if (!state[index_back]) {
						System.out.println("请输入归还日期(1-31)：");
						int day_back = input.nextInt();

						// while ((day_back < 1 || day_back > 31)
						// || (day_back < date[index_back])) {
						// System.out
						// .println("输入日期应在（1-31），并且归还日期大于借出日期,您的dvd借出日期是："
						// + date[index_back] + "日");
						// day_back = input.nextInt();
						// }
						while (true) {
							if (day_back < 1 || day_back > 31) {
								System.out.println("请输入日期（1-31）：");
								day_back = input.nextInt();
								continue;
							}
							if (day_back < date[index_back]) {
								System.out.println("归还日期应比借出日期大，请重新输入:");
								day_back = input.nextInt();
								continue;
							}
							break;
						}
						int money_back = day_back - date[index_back] == 0 ? 1
								: day_back - date[index_back];

						state[index_back] = true;
						date[index_back] = 0;
						System.out.println("归还dvd成功！费用：" + money_back
								+ "元，欢迎下次光临!");

					} else {
						System.out.println("该dvd未借出，不能归还!");
					}

				} else {
					System.out.println("没找相应的dvd！");
				}

				System.out.println("-----------------");

				break;
			case 6:
				System.out.println("-->退出 DVD");
				return;
			default:
				System.out.println("输出错误");
				System.out.println("-----------------");
				break;
			}
			System.out.println("输入0返回");
			num = input.nextInt();

		} while (num == 0);

	}
}
