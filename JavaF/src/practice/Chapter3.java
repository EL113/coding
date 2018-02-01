package practice;

import java.util.Scanner;

import util.Test;

public class Chapter3 implements Test{
	//scanner对象只在next的时候才会发生阻塞，等待键盘输入；
	//scanner对象可以不关闭，最好在最后不使用时调用close关闭
	private Scanner scanner;
	
	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}
	
	private void addNum() {
		System.out.print("please enter the a, b, c:");
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int s = b * b - 4 * a * c;
			if (s > 0) {
				System.out.println("有两个根");
			}else if (s == 0) {
				System.out.println("有一个根");
			}else {
				System.out.println("没有根");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("程序错误");
		}
	}
	
	private void orderNum() {
		System.out.print("please enter the a, b, c:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int[] nums = {a, b, c};
		for(int j=nums.length - 1; j > 0; j--) {
			for(int i=0; i < j; i++) {
				if (nums[i] < nums[i+1]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%s ", nums[i]);
		}
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
//		addNum();
		orderNum();
	}
}
