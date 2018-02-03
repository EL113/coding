package practice;

import java.util.Scanner;

import util.Test;

public class Chapter8 implements Test{
	private Scanner scanner;

	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}
	
	private void multipleMatrix() {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		
		System.out.println("Enter 9 numbers for matrix1:");
		multipleMatrix_read(a);
		System.out.println("Enter 9 numbers for matrix2:");
		multipleMatrix_read(b);
		
		int[] d = new int[9];
		int count = 0;
		//表示第二个矩阵的第i列
		for (int i = 0; i < b[1].length; i++) {
			//表示第一个矩阵的第z行
			for(int z=0; z < a.length; z++) {
				int total = 0;
				//表示第一个矩阵的第j行和第二个矩阵的第j列
				for(int j=0; j < b[1].length; j++) {
					 total += a[z][j] * b[j][i];
				}
				d[count++] = total;
			}
		}
		
		count = 0;
		for (int i = 0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				c[j][i] = d[count++];
			}
		}
		
		for(int j=0; j < 3; j++) {
			for(int z=0; z < 3; z++) {
				System.out.printf("%-3d", a[j][z]);
			}
			if (j == 1) {
				System.out.print("*  ");
			}else {
				System.out.print("   ");
			}
			
			for(int z=0; z < 3; z++) {
				System.out.printf("%-3d", b[j][z]);
			}
			if (j == 1) {
				System.out.print("=  ");
			}else {
				System.out.print("   ");
			}
			for(int z=0; z < 3; z++) {
				System.out.printf("%-5d", c[j][z]);
			}
			System.out.println();
		}
	}
	
	private void multipleMatrix_read(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				a[i][j] = scanner.nextInt();
				scanner.nextLine();
			}
		}
	}
	
	private void wellGame() {
		int[][] well = new int[3][3];
		wellGame_printWell(well);
		//1表示X，2表示O
		int role = 1;
		//开始输入
		while (true) {
			switch (wellGame_checkWin(well)) {
			case 1:
				System.out.println("X wins");
				return;
			case 2:
				System.out.println("O wins");
				return;
			case 3:
				System.out.println("ties");
				return;
			default:
				break;
			}
			
			if (role == 1) {
				System.out.print("you are X now, Enter your coordinates:");
			}else {
				System.out.print("you are O now, Enter your coordinates:");
			}
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			scanner.nextLine();
			//判断条件是从左到右判断的，判断顺序也很重要
			while(x > 3 || x < 0 || y > 3 || y < 0 
					|| well[x-1][y-1] == 1 || well[x-1][y-1] == 2) {
				System.out.print("invalid codinates, please enter again:");
				x = scanner.nextInt();
				y = scanner.nextInt();
				scanner.nextLine();
			}
			well[x-1][y-1] = role;
			role = role==1 ? 2 : 1;
			wellGame_printWell(well);
		}
		
	}
	
	private void wellGame_printWell(int[][] well) {
		for(int i=0; i < well.length; i++) {
			System.out.println("--------------");
			for(int j=0; j < well[i].length; j++) {
				if (well[i][j] == 0) {
					System.out.print("|   ");
				}else if(well[i][j] == 1){
					System.out.print("| X ");
				}else {
					System.out.print("| O ");
				}
			}
			System.out.println("|");
			if (i==2) {
				System.out.println("--------------");
			}
		}
	}
	//0 表示还未分出胜负；1表示X获胜； 2表示O获胜；3表示平局
	private int wellGame_checkWin(int[][] well) {
		//交叉的情况
		if (well[0][0] == 1 && well[1][1] == 1 && well[2][2] == 1) {
			return 1;
		}else if (well[0][0] == 2 && well[1][1] == 2 && well[2][2] == 2) {
			return 2;
		}else if (well[0][2] == 1 && well[1][1] == 1 && well[2][0] == 1) {
			return 1;
		}else if (well[0][2] == 2 && well[1][1] == 2 && well[2][0] == 2) {
			return 2;
		}
		//行胜出的情况
		for(int i=0; i < well.length; i++) {
			int winCnt1 = 0;
			int winCnt2 = 0;
			for(int j=0; j < well[i].length; j++) {
				if (well[i][j]==1) {
					winCnt1++;
				}else if (well[i][j]==2) {
					winCnt2++;
				}
			}
			if (winCnt1==3) {
				return 1;
			}else if (winCnt2==3) {
				return 2;
			}
		}
		//列胜出的情况
		for(int i=0; i < well.length; i++) {
			int winCnt1 = 0;
			int winCnt2 = 0;
			for(int j=0; j < well[i].length; j++) {
				if (well[j][i]==1) {
					winCnt1++;
				}else if (well[j][i]==2) {
					winCnt2++;
				}
			}
			if (winCnt1==3) {
				return 1;
			}else if (winCnt2==3) {
				return 2;
			}
		}
		
		//没有填完的情况
		for(int i=0; i < well.length; i++) {
			for(int j=0; j < well[i].length; j++) {
				if (well[i][j]==0) {
					return 0;
				}
			}
			
		}
		//平局的情况
		return 3;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
//		multipleMatrix();
		wellGame();
	}
}
