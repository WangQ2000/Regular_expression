package com.wang.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	public static void main(String[] args) {
		//ƥ���ַ����Ƿ����������ʽ
		
		//���ʽ����
		Pattern pattern = Pattern.compile("\\w+");
		
		//����Matcher����
		Matcher matcher = pattern.matcher("abd5453");
		
		boolean flag = matcher.matches();
		System.out.println(flag);
	}
}
