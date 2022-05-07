package com.Question1;

import java.util.Scanner;

import com.Question1.Floor;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number floors in the building : ");
		
		int numFloor = sc.nextInt();
		
		int[] floorArr = new int[numFloor];
		
		
		for(int i=0; i<floorArr.length; i++) {
			
			System.out.println("Enter the floor size given on day : "  + (i+1));
			floorArr[i] = sc.nextInt();
			
			}
		
		
		Floor floor = new Floor();
		floor.FloorConstUtil(floorArr);
		
		sc.close();
		}
	
}