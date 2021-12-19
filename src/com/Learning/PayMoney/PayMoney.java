package com.Learning.PayMoney;

import java.util.Scanner;

public class PayMoney {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] transaction;
		
		int size;
		System.out.println("Enter the size of the transaction array");
		size = sc.nextInt();
		transaction = new int[size];
		
		System.out.println("Enter the values of array");
		
		for (int i=0; i<size; i++) {
			transaction[i] = sc.nextInt();
		}
		
		checkTarget(sc,transaction);	
		
		sc.close();
		System.exit(0);
	}

	public static void checkTarget(Scanner sc, int transaction[]) {
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numTarget = sc.nextInt();
		
		do {
			boolean isTargetAchieved = false;
			int sum=0;
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			
			for(int i=0; i<transaction.length; i++) {
				sum+=transaction[i];
				
				if(sum >= targetValue) {
					isTargetAchieved = true;
					System.out.println("Target achieved after "+(i+1)+" transactions");
					break;
				}							
			}
			
			if (isTargetAchieved == false) 
				System.out.println("Given target is not achieved ");
			
			numTarget--;
		} while(numTarget > 0);
				
	}
}
