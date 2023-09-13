package com.collectionPractice;

import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		Stack<String> color = new Stack<>();
		color.push("red");
		color.push("black");
		color.push("white");
		System.out.println(color);
		//System.out.println(color.peek());
		//System.out.println(color.pop());
		System.out.println(color.search("red"));
		System.out.println(color.indexOf("red"));
		
	}

}
