package com.collectionPractice;

import java.util.Arrays;
import java.util.Vector;

public class VL2Practice {
	public static void main(String[] args) {
		
		Object[]  o = new Object[] {1,2,3,4,5,6};
		Vector<Integer> v = new Vector(Arrays.asList(o));
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
	}

}
