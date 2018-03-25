package Proj1;

import java.io.*;
import java.util.Arrays;

public class Uppgift5 {

	public static void main(String[] cmdln) {
		int[] symbols = new int[127];   // Initializing array with 127 elements (for each ASCII- symbol)
		int counter = 0;
		Arrays.fill(symbols, 0);  // Fills the array with zeros

		try {
			File filen = new File(cmdln[0]);                   // Importing file
			FileInputStream fil = new FileInputStream(filen);
			while (fil.available() > 0) {    // check's so that the file has any symbols left
				char chartemp = (char) fil.read();  // reading one byte and typecasting it to a char
				int inttemp = (int) chartemp; // typecasting the char to an int
				symbols[inttemp] = symbols[inttemp] + 1; // incrementing the "char int" by 1
				counter++;
			}
			System.out.println(Arrays.toString(symbols));
			fil.close();

			for (int i = 0; i < symbols.length; i++) {
				double percentage;
				int amount;
				char character;

				if (symbols[i] != 0) {
					character = (char) i;
					amount = symbols[i];
					percentage = symbols[i] / (double) counter;
					System.out.println(character + " occured " + amount + " times, frequency: " + percentage + "%");
				}

			}

		} catch (Exception e) {
			System.out.println("Could not find file!");
		}

	}

}