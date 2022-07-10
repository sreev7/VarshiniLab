package classdeno.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import classdeno.service.CurrencyDenominator;

public class DriverClass {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int noOfDenominations = scan.nextInt();		
		
		Integer denominations[] = new Integer[noOfDenominations];
		System.out.println("enter the curreny denominations value");
		for(int index = 0; index < denominations.length; index++)
		{
			denominations[index] = scan.nextInt();			
		}
		
		System.out.println("Enter the amount you want to pay");
		int amountToPay = scan.nextInt();
		
		//sorting using collections
		Arrays.sort(denominations, Collections.reverseOrder());	
		
		CurrencyDenominator cd = new CurrencyDenominator();
		cd.calculateAmounttoPay(denominations, amountToPay);
		scan.close();
		
		
	}

}
