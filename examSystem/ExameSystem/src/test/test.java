/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Daniel hunt
 */
public class test {
    public static void main(String[] args){
        String test = "成绩id:1  用户id:123456  姓名:留下  分数:0  考试时间:2018-01-02 12:47:10.0";
        int endIndex = test.indexOf("  用户");
        String subStr = test.substring(5, endIndex);
        System.out.println(subStr);
    }
}
