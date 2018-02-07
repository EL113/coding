package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import util.Test;

public class Chapter12 implements Test{

	private Scanner scanner;

	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}

	private void addCal() {
		System.out.print("Enter your equation(a + b):");
		try {
			int a = scanner.nextInt();
			scanner.next();
			int b = scanner.nextInt();
			System.out.println(a + " + " + b + " = " + (a+b));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("unvalid equation");
		}
	}
	
	//创建file文件和查找file文件都是在工程目录下开始的（和src目录同级的目录）
	//其他目录见：https://www.cnblogs.com/alipayhutu/archive/2012/06/21/2558289.html
	private void copyFile() {
		System.out.println("Enter your code(java copy oldFile newFile):");
		String codeLine = scanner.nextLine();
		String[] codeStr = codeLine.split(" ");
		while (codeStr.length != 4 || !codeStr[0].equals("java") || !codeStr[1].equals("copy") ) {
			System.out.println("unvalide codeline(java copy oldFile newFile),try again");
			codeLine = scanner.nextLine();
			codeStr = codeLine.split(" ");
		}
		
		File oldFile = new File("src/practice/"+codeStr[2]);
		File newFile = new File("src/practice/"+codeStr[3]);
		if (!oldFile.exists()) {
			System.out.println(codeStr[2] + " doesn't exist");
			System.exit(1);
		}
		
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Scanner scanner = null;
		PrintWriter writer = null;
		try {
			scanner = new Scanner(oldFile);
			writer = new PrintWriter(newFile);
			while (scanner.hasNextLine()) {
				writer.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (scanner != null) {
				scanner.close();
			}
			
			if (writer != null) {
				writer.close();
			}
		}
	}
	
	private void createDataset() {
		System.out.println("Enter score(name age course score),press q to exit:");
		File file = new File("src/practice/test.txt");
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(file);
			while (true) {
				String data = scanner.nextLine();
				if (data.equals("q")) {
					writer.close();
					return;
				}
				writer.println(data);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
//		addCal();
//		copyFile();
		createDataset();
	}
}
