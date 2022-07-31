package decide;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class decision {

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		//Input for no. of floors
		System.out.println("enter the no of floors");
		int floors = scan.nextInt();

		//Taking 2 arrayList: 1 for all entered values, 1 for sorted floor values
		Integer floorSize[] = new Integer[floors];
		Integer sortedFloorSize[] = new Integer[floors];

		//User input for each day upto the no.of floors size
		for(int index = 0; index < floorSize.length; index++)
		{
			System.out.println("enter the floor size given on day: "+ (index+1));
			floorSize[index] = scan.nextInt();
			sortedFloorSize[index] = floorSize[index];
		}			
		scan.close();

		Arrays.sort(sortedFloorSize,Collections.reverseOrder());

		System.out.println("\nThe order of construction is as follows: ");
		//Method to determine the construction order for each day
		constructionOrder(floorSize,sortedFloorSize);
	}

	public static void constructionOrder(Integer floorSize[],Integer sortedFloorSize[] )
	{
		Stack<Integer> stack = new Stack<Integer>();
		int printedTillElement = 0;
		int compareElement = 0;
		for(int i = 0; i< floorSize.length; i++) 
		{
			//Comparing floorsize with the first element of sortedArray if enteredValue of that day is < sortedArray's first element
			//push to stack, if equal then print the element directly and increment printedtillArray
			//Repeat the process
			if((floorSize[i] < sortedFloorSize[compareElement]))
			{
				System.out.println("Day"+ (i+1) +" :\n");					
				stack.push(floorSize[i]);				
			}

			if(floorSize[i] == sortedFloorSize[compareElement])
			{
				printedTillElement++;
				System.out.println("Day"+ (i+1 ) + " :\n " + sortedFloorSize[compareElement] );					  
				//To check if next sorted element was entered in previous days. Repeat the process
				for(int j = 0 ; j < i ; j++)
				{			
					if(printedTillElement < sortedFloorSize.length) {
						if(floorSize[j] == sortedFloorSize[printedTillElement]) 
						{
							System.out.println(" "+ floorSize[j]);
							stack.pop();
							printedTillElement++;							
							j=0;							
						}
					}
				}
				if(compareElement != sortedFloorSize.length)
				{
					compareElement = printedTillElement;
				}		
			}

			if(i == floorSize.length - 1)
			{						
				while(!stack.empty()) 
				{
					System.out.println(stack.pop());
				}
			}			
		}
	}
}

