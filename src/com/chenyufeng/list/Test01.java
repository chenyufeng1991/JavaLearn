package com.chenyufeng.list;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("A");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		
		if (lists.isEmpty()) {
			System.out.println("为空");
		}
		else {
			System.out.println("不为空");
		}
		
		System.out.println(lists.indexOf("C"));
		
	}

}
