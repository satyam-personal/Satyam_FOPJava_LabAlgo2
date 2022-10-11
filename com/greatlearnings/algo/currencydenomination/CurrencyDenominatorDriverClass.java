package com.greatlearnings.algo.currencydenomination;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominatorDriverClass {
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of currency denominations: ");
			int size = scanner.nextInt();
			
			int[] denominations = new int[size];
			
			for (int i=0; i< size; i++) {
				System.out.println("Enter the size of currency denominations: ");
				denominations[i] = scanner.nextInt();
			}
			
			ArrayUtil.mergeSort(denominations);
			System.out.println(Arrays.asList(denominations).toString());
			
			int[] counter = new int[size];
			
			System.out.println("Enter the amount you want to pay: ");
			int amount = scanner.nextInt();
			//int remainingAmount = countNotes(denominations, counter, low, high, amount);			
			
		}
	
}
