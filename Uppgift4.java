package Proj1;
import java.util.Arrays;

public class Uppgift4 {

	 public static int[] addAtIndex(int[] a, int x, int index) {
		 if(a[index] != 0) {
			 for(int i = a.length-1; i > index ; i--) {
				 
				 a[i] = a[i-1];
				 
			 }
			 a[index] = x;
		 }
		 else {
			 a[index] = x;
		 }
		 return a;
	 }
	 
	 public static void main(String[] cmdln) {
		 int[] arr = {0,1,0,0,0,2,0,1,4,0};
		 arr = addAtIndex(arr, 9, 5);
		 System.out.println(Arrays.toString(arr));
	 }
}
