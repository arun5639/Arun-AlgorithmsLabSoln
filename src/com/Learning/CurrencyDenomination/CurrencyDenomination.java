package com.Learning.CurrencyDenomination;

import com.Learning.MergeSort.*;
import java.util.Scanner;

public class CurrencyDenomination {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] denomination;
		
		int size;
		System.out.println("Enter the size of the Currency Denominations");
		size = sc.nextInt();
		denomination = new int[size];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<size; i++) {
			denomination[i] = sc.nextInt();
		}
		
		MergeSort ms = new MergeSort();		
		ms.mergeSort(denomination,0,size-1);		
		makePayment(sc,denomination);
		
		sc.close();
		System.exit(0);
	}
	
	public static void makePayment(Scanner sc, int [] denomination) {
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		int bal=amount;
		
		int [] notes = new int[denomination.length];
		
		for(int i=0; i<denomination.length; i++) {
			
			notes[i] = bal/denomination[i];
			bal = bal%denomination[i];
			
			if (bal <= 0)
				break;
		}
		
		if (bal>0) {
			System.out.println("Payment could not be processed with the available denominations");
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0; i<denomination.length; i++) {
				if(notes[i] > 0)
					System.out.println(denomination[i]+" : "+notes[i]);
			}
		}		
	}
	
}
