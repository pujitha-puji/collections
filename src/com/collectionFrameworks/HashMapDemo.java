package com.collectionFrameworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap();
			m.put("canada", 700);
			m.put("america", 800);
			m.put("japan", 200);
			m.put("india", 500);
			System.out.println(m);
			System.out.println(m.put("canada", 10000));
			System.out.println(m);
			Set<String>s = m.keySet();
			System.out.println(s);
			Collection<Integer>values = m.values();
			System.out.println(values);
	}

}
