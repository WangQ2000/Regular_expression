package com.wang.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	public static void main(String[] args) {
		//匹配字符串是否符合正则表达式
		
		//表达式对象
		Pattern pattern = Pattern.compile("\\w+");
		
		//创建Matcher对象
		Matcher matcher = pattern.matcher("abd5453");
		
		boolean flag = matcher.matches();
		System.out.println(flag);
	}
}
