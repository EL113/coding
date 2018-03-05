package practice;

import java.util.Scanner;

import util.Test;

public class Chapter18 implements Test{
	private Scanner scanner;
	
	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}
	
	private void ArraySum() {
		System.out.println("Enter number:");
		int n = scanner.nextInt();
		System.out.println("The sum is "+ArraySum(n));
	}

	//用整型做除法时，注意先把数字转型再除
	private double ArraySum(int n) {
		if (n == 1) {
			return (double)1/2;
		}else {
			return ArraySum(n-1) + (double)n / (n+1);
		}
	}
	
	private void reverseNum() {
		System.out.println("Enter number:");
		int n = scanner.nextInt();
		reverseNum(n);
	}
	
	private void reverseNum(int num) {
		if ((num/10) != 0) {
			System.out.print(num%10);
			reverseNum(num/10);
		}else {
			System.out.println(num);
		}
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
//		ArraySum();
		reverseNum();
	}
}
