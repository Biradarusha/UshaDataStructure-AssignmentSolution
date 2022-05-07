package com.Question1;

import java.util.Scanner;

import java.util.Stack;

public class Floor{
	
	public void FloorConstUtil(int[] floorArr) {
		
		Stack<Integer> st = new Stack<>();
		
		System.out.println("the order of construction is as follows: ");
		int num = floorArr.length;
		
		for(int i=0; i<floorArr.length; i++) {
			
			st.push(floorArr[i]);
			
			System.out.println("Day " + (i +1) );
			
			while(!st.isEmpty() && st.peek() == num) {
				
				System.out.print(st.pop() + " ");
				num--;
				
				}
			
			System.out.println();
		}
				
	}
}















