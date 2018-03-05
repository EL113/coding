package practice;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import util.Test;

public class Chapter20 implements Test{

	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	//也可以使用优先队列，优先队列默认按升序排列字符串
	private void StringAsc() {
		List<String> words = Arrays.asList("system", "java", "word", "computer", "agorithem");
		Collections.sort(words);
		for(String word:words) {
			System.out.print(word+" ");
		}
		System.out.println();
	}
	
	//可以使用递归，也可以用一个容器储存所有文件对象，只要容器对象就继续查找
	//队列用双向链表实现
	private void getDirectorySize() {
		File directory = new File("src/practice");
		Queue<File> fileQueue = new LinkedList<>();
		fileQueue.offer(directory);
		long totalSize = 0;
		
		while (!fileQueue.isEmpty()) {
			File file = fileQueue.poll();
			if (file.isDirectory()) {
				for(File file2: file.listFiles()) {
					fileQueue.offer(file2);
				}
			}else {
				totalSize += file.length();
			}
		}
		System.out.println("The size of the directory is " + totalSize);
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
//		StringAsc();
		getDirectorySize();
	}
}
