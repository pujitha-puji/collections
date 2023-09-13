package com.collections.practice.programs;

import java.util.ArrayList;

public class SumAndAverage {
	public static void main(String[] args) {
		int sum =0;
		int avg;
		ArrayList<Integer> num = new ArrayList<>();
		num.add(4);
		num.add(5);
		num.add(0);
		num.add(9);
		num.add(8);
		num.add(10);
		System.out.println(num);
		for(int i=0; i<num.size(); i++){
			sum = sum + num.get(i);
			avg = sum/num.size();
			System.out.println("the avg list = " + avg);
		}
	}

}
