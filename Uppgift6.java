package Proj1;

import java.util.Arrays;

public class Uppgift6 {

	public static int[] mergeArrays(int[] a, int[] b) {

		try {
			int[] arr = new int[a.length + b.length]; // Initializing new array with the length of a+b
			int i = 0, j = 0, k = 0;
			while (i < a.length && j < b.length) { // Comparing elements with eachother and depending
				if (a[i] < b[j]) { // on which element that is lower than the other
					arr[k] = a[i]; // we put that element in the new array
					i++;
					k++;
				} else {
					arr[k] = b[j];
					j++;
					k++;
				}

			}

			if (i < a.length) { // These arraycopy's take what's rest of an array and
								// Fills the rest of the new array the rest
				System.arraycopy(a, i, arr, k, (a.length - i));
			}

			if (j < b.length) {

				System.arraycopy(b, j, arr, k, (b.length - j));

			}
			return arr;

		} catch (Exception e) {
			System.out.println("Error occured");

		}

		return null;
	}

	public static boolean isSorted(int[] a) { // Checking so that the array is sorted
		try {
			for (int i = a.length - 1; i > 0; i--) {  
				if (a[i] < a[i - 1]) {    
					return false;
				}
			}
		} catch (Exception e) {

		}
		return true;
	}

	public static void main(String[] cmdln) {
		for (int i = 0; i < 20; i++) {
			int[] a = new int[(int) (Math.random() * 26) + 1];  //Creating arrays with 1-25 elements
			int[] b = new int[(int) (Math.random() * 26) + 1];

			for (int j = 0; j < a.length; j++) {           // Filling the new arrays with values between 1-100
				a[j] = (int) (Math.random() * 100) + 1;
			}
			for (int j = 0; j < b.length; j++) {
				b[j] = (int) (Math.random() * 100) + 1;
			}

			Arrays.sort(a);  // Sorting new arrays
			Arrays.sort(b);

			int[] c = mergeArrays(a, b);
			System.out.println(Arrays.toString(c));
			System.out.println(isSorted(c));

		}

	}

}
