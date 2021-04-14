
public class getChange {


				
	public static void calculateChange()
	{
		int[] numCoinsReq = {0, 0, 0, 0, 0, 0, 0, 0};
		for(int i = 7; i >= 0; i--)
		{
			while(BasicQs.cost + Coins.array[BasicQs.pick - 1][i] <= BasicQs.bill)
			{					
					BasicQs.cost += Coins.array[BasicQs.pick - 1][i];
					numCoinsReq[i] ++;
			}
		}


		System.out.println(" Here's your change: " + (BasicQs.bill - BasicQs.ogPick));
		System.out.println();
		for(int j = 0; j < numCoinsReq.length; j++)
			System.out.println("\t" + (Coins.array[BasicQs.pick - 1][j]) + ": " + numCoinsReq[j]);
		
		
	}


}
