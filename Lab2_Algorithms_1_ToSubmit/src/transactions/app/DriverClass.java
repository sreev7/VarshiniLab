package transactions.app;

import java.util.Scanner;

import transactions.service.Transaction;

public class DriverClass {
	
 public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the values of array");
			
		for(int i=0;i<size;i++)
		{
		  arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNum = sc.nextInt();
		
		//System.out.println("enter value of target");
		//int target = sc.nextInt();
		
		Transaction tc = new Transaction();
		tc.transactions( targetNum,  size, arr);
		
		sc.close();
  }
}
