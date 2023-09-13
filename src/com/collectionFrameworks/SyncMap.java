package com.collectionFrameworks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SyncMap extends Thread{
	static Map<Integer, String> m = new HashMap<>();
	public void run() {
		m.put(4, "Muffins");
		m.put(5, "Desserts");
		m.put(6, "Tortillas");
		m.put(7, "Biriyani");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread()+"updated List"+ m);
		}
	}
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread()+"updated map");
		SyncMap t1 = new SyncMap();
		t1.start();
		Map<Integer, String> syncmap = Collections.synchronizedMap(m);
		syncmap.put(1, "Crossiant");
		syncmap.put(2, "Breads");
		syncmap.put(3, "Cookies");
		
		Set s1 = m.entrySet();
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"............"+m1.getValue()+"");
			Thread.sleep(500);
		}
		
	}

}
