package transactions.service;
import java.util.Scanner;
public class Transaction {
	
	public void transactions(int targetNum, int size, int[] arr) 
	{	
		Scanner sc = new Scanner(System.in);
		while(targetNum-- != 0)
		{
			boolean present = false;						
			long sum =0;					
			System.out.println("enter value of target");
			int target = sc.nextInt();
			
			for(int i=0;i<size;i++)
			{
				sum+=arr[i];
				if(sum>=target)
				{
					System.out.println("Targer achieved after " + (i+1) + " transaction(s)");
					present =true;
					break;
				}
			}
			
			if(!present)
			{
				System.out.println("Given target is not achieved");
			}			
					
		}
		System.out.println("Program completed successfully");
		sc.close();
	}

}
