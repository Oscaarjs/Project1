package Proj1;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Uppgift8 {
	public static boolean addToList(ArrayList<String> list, String name) {
		int index = list.size();
		for (int i = 0; i < list.size() - 1; i++) {
			String current = list.get(i).replaceAll("\\s+", "");  //Removing all whitespace in each name
			String next = list.get(i + 1).replaceAll("\\s+", "");
			String trimname = name.replaceAll("\\s+", "");

			if (current.equals(trimname)) {  // If the name exists in the list; return false
				return false;

			} else if (trimname.compareTo(current) > 0) { // Checking which index the name should be placed on
				if (trimname.compareTo(next) < 0) {
					index = i + 1;
				}

			}

		}
		list.add(index,name);
		System.out.println(list);
		return true;
	}

	

	public static void main(String[] cmdln) {
		ArrayList<String> klasslista = new ArrayList<String>();
		String[] names = { "Amanda	Andersson", "Donald Trumpeten", "Janne Bildoktor", "Oscar Johansson",
				"Gustav Andersson", "Zorro Zorrosson", "Zzueen Queeson" };

		try {
			File fil = new File(cmdln[0]);      // Creating an arraylist with the different names
			Scanner scan = new Scanner(fil);
			while (scan.hasNext()) {
				String s = scan.nextLine();
				klasslista.add(s);

			}
			Collections.sort(klasslista);  // Sorting the list alphabetically 

			for (int i = 0; i < names.length; i++) {

				addToList(klasslista, names[i]);

			}

			scan.close();
		} catch (Exception e) {
			System.out.println("Cant Find File");
		}

	}

}
