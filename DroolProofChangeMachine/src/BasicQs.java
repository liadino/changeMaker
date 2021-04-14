import java.util.Scanner;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class BasicQs {


				static int cost;
				static int ogPick;
				static int bill;
				static String currencyChoice;
				static int pick;
				static ArrayList<String> currencies = new ArrayList<String>();
				
	public static void basics()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What type of currency are you paying in? ");
		int counter = 1;
		for(String s : currencies)
		{
			System.out.println("\n" + counter + ": " + s);
			counter++;
		}
		pick = input.nextInt();
		currencyChoice = currencies.get(pick - 1);
		Scanner input2 = new Scanner(System.in);
		System.out.println();
		System.out.println("What would you like to buy? ");
		System.out.println("\t 1) A jar of pickles ($10) ");
		System.out.println("\t 2) A banana ($4) ");
		System.out.println("\t 3) Salad ingredients ($20) ");
		System.out.println("\t 4) A small child ($500) ");
		cost = input2.nextInt();
		switch(cost) {
		case 1:
			cost = 10;
			break;
		case 2: 
			cost = 4;
			break;
		case 3: 
			cost = 20;
			break;
		case 4: 
			cost = 500;
			break;

		}
		ogPick = cost;
		Scanner input3 = new Scanner(System.in);
		System.out.println();
		System.out.println("How much are you paying: ");
		bill = input3.nextInt();
		System.out.println();
		System.out.println(bill);
		
	}

}
