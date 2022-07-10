package classdeno.service;

public class CurrencyDenominator {
	
	public void calculateAmounttoPay(Integer notes[], int amountToPay) {
	
	int[] noteCounter = new int[notes.length];	
	
	for(int  i= 0; i<notes.length; i++)
	{
		if(amountToPay >= notes[i]);
		{
			noteCounter[i] = amountToPay/notes[i];
			amountToPay = amountToPay % notes[i];
		}
	}
	
	if(amountToPay !=0)
	{
		System.out.println("Exact change not available in the denominations");
	}
	else 
	{
		System.out.println("Your payment approach in order to give min no of notes will be");
		System.out.println("Currency Count -->");
		for(int i = 0; i< notes.length;i++)
		{		
			if(noteCounter[i]!=0)
			{
				System.out.println(notes[i] + " : " + noteCounter[i]);						
			}			
		}
	}
	
  }	
}
