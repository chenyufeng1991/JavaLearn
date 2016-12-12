package com.chenyufeng.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test01 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("key1", "111");
		map.put("key2", "222");
		map.put("key3", "333");
		map.put("key4", "444");
		map.put("key5", "555");
		System.out.println(map.get("key3"));

		// 判断是否包含某个键
		if (map.containsKey("key1")) {
			System.out.println("key存在");
		}
		else {
			System.out.println("key不存在");
		}
		
		//判断是否包含某个值
		if (map.containsValue("666")) {
			System.out.println("value存在");
		}
		else {
			System.out.println("value 不存在");
		}
	
		//得到map中所有的键
	    Set<String>set	= map.keySet();
	    Iterator<String> iterator = set.iterator();
	    while (iterator.hasNext()) {
	    	System.out.println(iterator.next());
		}
		
	    //得到map中所有的值
	    Collection<String> collection = map.values();
	    Iterator<String>iterator2 = collection.iterator();
	    while (iterator2.hasNext()) {
	    	System.out.println(iterator2.next());
		}
		
		
	}

}
