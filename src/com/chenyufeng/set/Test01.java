package com.chenyufeng.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("G");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("A");
		hashSet.add("E");
		hashSet.add("E");//不能加入重复元素，会自动过滤
		System.out.println(hashSet);
		
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("G");
		treeSet.add("D");
		treeSet.add("F");
		treeSet.add("A");
		treeSet.add("E");
		System.out.println(treeSet);
		
			
		
	}
}
