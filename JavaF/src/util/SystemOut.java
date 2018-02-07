package util;

import java.util.Scanner;

/*
 * scanner.next()，读取完字符串后都会留下回车符在缓冲区，而scanner.nextline()，会读取上个next()留下的回城符作为分隔符
 *需要在next()后面加一个nextline()把回车符处理掉
 */
public class SystemOut {
	public static void print(Test test) {
		Scanner scanner = new Scanner(System.in);
		test.setScanner(scanner);
		String qString = "a";
		while(!qString.equals("q")) {
			test.test();
			System.out.println("按任意键继续，按q退出");
			qString = scanner.next();
			scanner.nextLine();
		}
		System.out.println("退出完成");
		scanner.close();
	}
}
