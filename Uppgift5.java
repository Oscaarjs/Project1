package Proj1;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Uppgift5 {
	
	public static void main(String[] cmdln) {
		int[] symbols = new int[127];
		int counter = 0;
		Arrays.fill(symbols, 0);


		try {
			Scanner fil = new Scanner(new BufferedReader(new FileReader("textfil.txt")));
			while(fil.hasNext()) {
				char chartemp = (char) fil.nextByte();
				int inttemp = (int) chartemp;
				symbols[inttemp] = symbols[inttemp]+1;
				counter++;
			}
			System.out.println(Arrays.toString(symbols));
			fil.close();
			
			for(int i = 0; i < symbols.length; i++) {
				double percentage;
				int amount;
				char character;
				
				if(symbols[i] != 0) {
					character = (char) i;
					amount = symbols[i];
					percentage = symbols[i] / (double) counter;
					System.out.println(character + " occured " + amount + " times, frequency: " + percentage + "%");
				}
				
			}
			
		}
		catch(Exception e) {
			System.out.println("Could not find file!");
		}
		
	}

}
