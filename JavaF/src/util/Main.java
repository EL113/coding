package util;

import practice.Chapter17;

/*
 * 关于接口interface:相当于把所有实现了同一个接口的类分到了一个组里面，他们有类似的行为特征；
 * 最好把全局都要用到的对象通过接口的set方法注入，而不是通过构造器，感觉这样方便组织代码，实例化对象和注入对象可以分开；
 * 构造器最好只是拿来做初始化数据的功能；
 */
public class Main {
	
	public static void main(String[] args) {
		Test test = new Chapter17();
		SystemOut.print(test);
	}
}
