package com.collectionFrameworks;

import java.util.HashMap;

public class IdHashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		Integer i1 = new Integer (10);
		Integer i2 = new Integer (10);
		m.put(i1, "Mohan");
		m.put(i2, "kumar");
		System.out.println(m);
		
	}

}
