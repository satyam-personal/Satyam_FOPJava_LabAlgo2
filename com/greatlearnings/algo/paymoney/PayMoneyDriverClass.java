package com.greatlearnings.algo.paymoney;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoneyDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the number of transactions: ");
				
			int noOfTransactions = scanner.nextInt();
			int[] trx = new int[noOfTransactions];
			
			for (int i=0; i < noOfTransactions; i++) {
				System.out.println("Enter next transaction: ");
				trx[i] = scanner.nextInt();
			}
			
			System.out.println(Arrays.asList(trx).toString());

			System.out.println("Enter the total number of targets to be achieved:");
			int targetNo = scanner.nextInt();
			
			int count = 0;
			
			while (targetNo -- != 0 ) {
				System.out.println("Please enter the value of target: ");
				int target = scanner.nextInt();
				
				long sum = 0;
				
				for (int i=0;i<noOfTransactions; i++) {
					sum += trx[i];
					if (target <= sum ) {
						System.out.println("Target achieved after "+(i+1)+" transactions");
						count =1;
						break;
					}
					
				}
				
			}
			if (count == 0) {
				System.out.println("Given target is not achieved");
			}
				
		}
	}

}
