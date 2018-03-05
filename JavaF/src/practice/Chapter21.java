package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import util.Test;

public class Chapter21 implements Test{
	private Scanner scanner;

	@Override
	public void setScanner(Scanner scanner) {
		// TODO Auto-generated method stub
		this.scanner = scanner;
	}
	
	//统计集合的最大值可以用collections.max得到
	private void statisticNum() {
		HashMap<Integer, Integer> statistic = new HashMap<>();
		List<Integer> times = new ArrayList<>();
		String stop = "a";
		System.out.println("Enter numbers (press q to quit):");
		while (!stop.equals("q")) {
			stop = scanner.next();
			if (stop.equals("q")) {
				continue;
			}
			int num = Integer.valueOf(stop);
			statistic.put(num, statistic.containsKey(num) ? statistic.get(num).intValue()+1 : 0);
			System.out.println("next number:");
		}
		
		int max = Collections.max(statistic.values());
		for(Entry<Integer, Integer> entry: statistic.entrySet()) {
			if (entry.getValue().equals(max)) {
				times.add(entry.getKey());
			}
		}
		
		for(int key: times) {
			System.out.print(key+" ");
		}
	}
	
	//TreeMap可以将map按照键进行升序排序，也可以传入一个comparable接口指定排序规则
	private void statisticWord() {
		SortedMap<String, Integer> wordStat = new TreeMap<String, Integer>();
		File file = new File("src/practice/test.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String key = scanner.next();
				wordStat.put(key, wordStat.containsKey(key) ? wordStat.get(key)+1 : 0);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		System.out.println(wordStat);
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
//		statisticNum();
		statisticWord();
	}
}
