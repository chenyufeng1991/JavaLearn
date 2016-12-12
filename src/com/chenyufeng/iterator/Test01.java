package com.chenyufeng.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("A");
		lists.add("E");
		lists.add("J");
		lists.add("O");
		lists.add("P");
		Iterator<String> iterator = lists.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		while (iterator.hasNext()) {
			//注意在迭代输出的时候，不能使用集合的remove；否则会报错
			String string = iterator.next();
			if (string.equals("J")) {
				iterator.remove();
			}
			else{
				System.out.println(string);
			}
		}
	}
}
