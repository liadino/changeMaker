	import java.util.Scanner;
	import java.io.*;

	public class FileReader {

				
				
				public static int getFileLines() throws IOException
					{
						int lineCount = 0;
						Scanner f = new Scanner(new File("currency.txt"));
						while(f.hasNext())
						{
							lineCount++;
							f.nextLine();
						}
						return lineCount;
						
					}
				
				
				


				


		

	}




