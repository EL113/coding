package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import util.Test;

public class Chapter7 implements Test{
	private Scanner scanner;

	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}

	//
	private void setLevle() {
		System.out.println("Enter the number of students:");
		int stuCnt = scanner.nextInt();
		int[] stuScore = new int[stuCnt];
		System.out.println("Enter the score of each student:");
		for (int i = 0; i < stuCnt; i++) {
			stuScore[i] = scanner.nextInt();
		}
		int[] tempScore = Arrays.copyOf(stuScore, stuCnt);
		Arrays.sort(tempScore);
		int best = tempScore[stuCnt-1];
		for(int i=0; i <stuCnt; i++) {
			if (best - stuScore[i] <= 10) {
				System.out.printf("student %s is A", i);
			}else if (best - stuScore[i] <= 20) {
				System.out.printf("student %s is B", i);
			}else if (best - stuScore[i] <= 30) {
				System.out.printf("student %s is C", i);
			}else if (best - stuScore[i] <= 40) {
				System.out.printf("student %s is D", i);
			}else {
				System.out.printf("student %s failed", i);
			}
			System.out.println();
		}
	}
	
	//关键在于产生7个不相同的随机数
	private void eightQ() {
		int[] queens = new int[8];
		for(int i=0; i<8; i++) {
			queens[i] = i;
		}
		
		Random random = new Random();
		for(int i=0; i<8; i++) {
			int a = random.nextInt(8);
			int b = random.nextInt(8);
			int temp = queens[a];
			queens[a] = queens[b];
			queens[b] = temp;
		}
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<queens[i]; j++) {
				System.out.print("| ");
			}
			System.out.print("|Q");
			for(int j=8-queens[i]; j>0;j--) {
				System.out.print("| ");
			}
			System.out.println("");
		}
	}
	
	public void guessWord() {
		String[] words = {"program", "procedure", "potato", "progress", "product", "public", "private"};
		String threshold = "y";
		while (threshold.equals("y")) {
			int missCnt = 0;
			Random random = new Random();
			//初始化掩码、真实文字、真实文字序列
			String word = words[random.nextInt(words.length)];
			String maskWord = "";
			String[] wordArray = word.split("");
			String[] mask = new String[wordArray.length];
			for(int i=0; i<mask.length;i++) {
				mask[i] = "*";
			}
			
			for(int i=0; i<mask.length; i++) {
				maskWord += mask[i];
			}
			//当掩码不等于真实文字时就持续循环
			while (!maskWord.equals(word)) {
				//猜数字
				System.out.println("(Guess) Enter a letter in word "+maskWord+" > ");
				String a = scanner.nextLine();
				
				//判断数字
				if (maskWord.contains(a)) {
					//掩码包含该文字的情况
					System.out.println(a + " already in the word");
				}else if (word.contains(a)) {
					//掩码不包含该文字但真实文字包含，显示替换掩码中的文字，否则保持掩码中的文字
					for(int i=0; i<mask.length;i++) {
						mask[i] = wordArray[i].equals(a) ? a : mask[i];
					}
				}else {
					//掩码不包含，真实文字也不包含，即猜错的情况
					missCnt++;
					System.out.println(a + " is not in the word");
				}
				
				//更新掩码文字
				maskWord = "";
				for(int i=0; i<mask.length; i++) {
					maskWord += mask[i];
				}
			}
			System.out.println("the word is " + word+"; you missed "+ missCnt + " times.");
			System.out.println("do you want to guess another word? Enter y or n>");
			threshold = scanner.nextLine();
		}
		
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
//		setLevle();
//		eightQ();
		guessWord();
	}
}
