import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Coins {
	static int[][] array;
	public static void getCoins() throws IOException
	{
		int counter = 0;
		
		array = new int[4][8];
		Scanner file = new Scanner(new File("currency.txt"));
		while(file.hasNext())
		{
			BasicQs.currencies.add(file.nextLine());
			String[] temp = file.nextLine().split(" ");
			for(int j = 0; j < temp.length; j++)
				array[counter][j] = Integer.parseInt(temp[j]);
			counter++;
		}
		
				
	}

}
