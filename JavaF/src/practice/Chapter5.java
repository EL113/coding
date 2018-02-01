package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import util.Test;

/*
 * 输入输出重定向
 * 输入重定向：java Chapter5 < filename
 * 输出重定向：java Chapter5 > filename
 * 复合：java Chapter5 < inputfile > outputfile
 */
public class Chapter5 implements Test{
	private Scanner scanner;
	
	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}
	
	private void staticNums() {
		System.out.print("Enter Integer numbers, end with 0:");
		int num = 0;
		int pCnt = 0;
		int nCnt = 0;
		int totalCnt = 0;
		int total = 0;
		double avg = 0;
		while ((num=scanner.nextInt()) != 0) {
			if (num > 0) {
				pCnt++;
			}else {
				nCnt++;
			}
			total+=num;
			totalCnt++;
		}
		avg = ((double)total)/totalCnt;
		System.out.println("number of positives:"+pCnt);
		System.out.println("number of negatives:"+nCnt);
		System.out.println("total:"+total);
		System.out.println("average:"+avg);
	}
	
	/*
	 * 数字塔：数字对齐 String.format("%-5d", i);前面的%5代表占位字符占的长度，i代表要填入的数字，-表示左对齐
	 * 将每个数字都看成一个整体，每个数字都自带一定数量的空格，所以每层只算数字个数就可以了
	 * 要表示更多数字，每个数字占的长度要增加才可以，目前的数字最大长度为5
	 */
	private void numTower() {
		System.out.println("Enter number of level:");
		int level = scanner.nextInt();
		
		for(int i=0;i<level;i++) {
			//打印空格
			for(int j=0;j<level-i-1;j++) {
				System.out.print("     ");
			}
			//打印前半段数字
			for(int k=0;k<i+1;k++) {
				System.out.print(String.format("%-5d", (int)Math.pow(2, k)));
			}
			//打印后半段数字
			for (int l = i-1; l >= 0; l--) {
				System.out.print(String.format("%-5d", (int)Math.pow(2, l)));
			}
			System.out.println("");
		}
		
	}
	
	/*
	 * 打印所有素数
	 * 对于Arrays.asList()方法只能接受基本类型的包装类，不接受基本类型,注意数组的初始化方法
	 * System.out.print():有时会抽风不打印数字；
	 * 要把所有可能的情况都考虑一遍
	 */
	private void printPrimes() {
		ArrayList<Integer> primes = new ArrayList<>();
		//初始化几个素数
		primes.addAll(Arrays.asList(new Integer[] { 2, 3}));
		//从4开始计算
		for(int i=4; i<1000;i++) {
			//每个数只计算比自己开根还小的素数就行了
			int end = (int) Math.sqrt(i);
			//只循环到临界值
			for(int j=0; j<primes.size(); j++) {
				int prime = primes.get(j);
				if (prime > end) {
					//并且如果到了临界值，就直接跳出
					break;
				}else if (i%prime == 0 && primes.contains(i)) {
					//如果能整除并又添加过就移除并跳出
					primes.remove(primes.indexOf(i));
					break;
				}else if (i%prime == 0 && !primes.contains(i)) {
					//如果能整除但没有添加过就直接跳出
					break;
				}else if(!primes.contains(i)){
					//不能整除但没有添加过，就暂时添加
					primes.add(i);
				}
				//不能整除，但添加过，不做处理
			}
		}
		//打印
		for (Integer prime : primes) {
			System.out.print(prime+" ");
		}
		System.out.println();
		System.out.println(primes.size());
	}
	
	//计算pi：一个比较大的数加减一个较小的数，这个较小的数就会被忽略
	private void computePi() {
		System.out.println("enter the n you want to compute:");
		int n = scanner.nextInt();
		double total = 0;
		for(int i=n; i>0; i--) {
			double num = Math.pow(-1, i+1) / (2*i-1);
			total += num;
		}
		double pi = 4 * total;
		System.out.println("pi:"+pi);
	}

	public void test() {
//		staticNums();
//		numTower();
//		printPrimes();
		computePi();
	}
	
}
