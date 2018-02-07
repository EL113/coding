package practice;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.Random;
import java.util.Scanner;

import util.Test;

public class Chapter17 implements Test{

	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	
	//对于文本文件IO，使用printWriter和Scanner, 二进制IO随意
	private void printerIO() {
		PrintWriter out = null;
		Random random = new Random();
		try {
			out = new PrintWriter(new File("src/practice/test.txt"));
			for(int i=0; i<100; i++) {
				out.print(random.nextInt(100));
				out.print(" ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (out != null) {
				out.close();
			}
		}
		System.out.println("success");
	}
	
	private void bIO() {
		File file = new File("src/practice/test1.dat");
		RandomAccessFile out = null;
		try {
			out = new RandomAccessFile(file, "rw");
			out.seek(file.length());
			for (int i = 0; i < 100; i++) {
				out.writeInt(i);
				out.writeChars(" ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("success");
	}
	
	private void addFileNum() {
		Scanner scanner = null;
		int numCnt = 0;
		int total = 0;
		try {
			scanner = new Scanner(new File("src/practice/test.txt"));
			int num = 0;
			while (scanner.hasNext()) {
				num = scanner.nextInt();
				total += num;
				numCnt++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		System.out.println("the total is " + total);
		System.out.println("number count is "+numCnt);
	}
	
	//随机访问IO只有一个类用来输入输出，并且如果文件不存在就创建
	//read和write都是从当前指针所在的位置开始读写
	private void departFile() {
		RandomAccessFile sourceFile = null;
		RandomAccessFile targetFile = null;
		try {
			sourceFile = new RandomAccessFile(new File("src/practice/test.txt"), "rw");
			byte[] buffer = new byte[(int) (sourceFile.length() / 5)];
			for(int i=1; i < 6; i++) {
				targetFile = new RandomAccessFile(new File("src/practice/test"+i+".txt"), "rw");
				sourceFile.read(buffer);
				targetFile.write(buffer);
				targetFile.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				sourceFile.close();
				targetFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void mergeFile() {
		RandomAccessFile target = null;
		RandomAccessFile source = null;
		
		try {
			target = new RandomAccessFile(new File("src/practice/merge.txt"), "rw");
			target.setLength(0);
			for(int i = 1; i < 6; i++) {
				source = new RandomAccessFile(new File("src/practice/test"+i+".txt"), "rw");
				byte[] buffer = new byte[(int) source.length()];
				source.read(buffer);
				target.write(buffer);
				source.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				source.close();
				target.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private void syphorFile() {
		RandomAccessFile source = null;
		RandomAccessFile target = null;
		try {
			source = new RandomAccessFile("src/practice/merge.txt", "rw");
			target = new RandomAccessFile("src/practice/syphor.txt", "rw");
			byte[] buffer = new byte[1];
			while ((source.read(buffer)) != -1) {
				buffer[0] = buffer[0]+=5;
				target.write(buffer);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				source.close();
				target.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void desyphorFile() {
		RandomAccessFile source = null;
		RandomAccessFile target = null;
		try {
			source = new RandomAccessFile("src/practice/syphor.txt", "rw");
			target = new RandomAccessFile("src/practice/desyphor.txt", "rw");
			byte[] buffer = new byte[1];
			while ((source.read(buffer)) != -1) {
				buffer[0] = buffer[0]-=5;
				target.write(buffer);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				source.close();
				target.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
//		printerIO();
//		bIO();
//		addFileNum();
//		departFile();
//		mergeFile();
//		syphorFile();
		desyphorFile();
	}
	
}
