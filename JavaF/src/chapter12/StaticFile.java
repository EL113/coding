package chapter12;

import java.io.File;
import java.util.Scanner;

/*
 * 从命令行运行文件：首先javac 文件名.java编译；然后java 文件名 命令行参数（运行要除去package那一行）；
 * 所有的命令行参数都保存在args数组里面；
 * scanner构造器接收file对象；接收字符串是对字符串进行读取，并不会解析成file文件
 */
public class StaticFile {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("unvalid input " + args.length);
			System.exit(1);
		}
		
		int characterCnt = 0;
		int lineCnt = 0;
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(args[0]));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
				characterCnt += line.split(" ").length;
				lineCnt++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		System.out.println("the file has " + characterCnt + " characters");
		System.out.println("the file has " + lineCnt + " lines");
	}
}
