package transactions;
import java.util.Scanner;

public class Transaction 
{
	
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
		
		while(targetNum-- != 0)
		{
			boolean present = false;			
			long target;
			long sum =0;
			
			System.out.println("enter value of target");
			target = sc.nextInt();
			
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
		sc.close();
	}
}
