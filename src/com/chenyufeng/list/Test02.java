package com.chenyufeng.list;

import java.util.List;
import java.util.Vector;

public class Test02 {

	// vector
	public static void main(String[] args) {
		List<String> lists = new Vector<String>();
		lists.add("A");
		lists.add("B");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		
		
		
	}

}
