package com.collectionFrameworks;

import java.util.IdentityHashMap;

public class IdHashMapDemo2 {
	public static void main(String[] args) {
	IdentityHashMap<Integer, String> m = new IdentityHashMap<>();
	Integer i1 = new Integer (10);
	Integer i2 = new Integer (10);
	m.put(i1, "Mohan");
	m.put(i2, "kumar");
	System.out.println(m);
	}

}
