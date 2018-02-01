package practice;

import java.util.Scanner;

import util.Test;

public class Chapter4 implements Test{
	private Scanner scanner;
	
	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}
	
	private void checkSSN() {
		System.out.println("enter your ssn:");
		String ssn = scanner.nextLine();
		if (ssn.contains(" ")) {
			System.out.println("invalid SSN1");
			return;
		}
		
		String[] ssnArr = ssn.split("-");
		if (ssnArr.length!=3 || ssnArr[0].length()!=3 || ssnArr[1].length()!=2 || ssnArr[2].length()!=4) {
			System.out.println("invalid SSN2");
			return;
		}
		
		System.out.printf("the ssn you enter is %s", ssn);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		checkSSN();
	}
	
}
