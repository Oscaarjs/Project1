package Proj1;

public class Uppgift4 {

	 public static int[] addAtIndex(int[] a, int x, int index) {
		 if(a[index] != 0) {
			 for(int i = index; i < a.length-1; i++) {
				 a[index] = 0;	
				 a[i+1] = a[i];
				 
			 }
		 }
		 else {
			 a[index] = x;
		 }
		 return a;
	 }
	 
	 public static void main(String[] cmdln) {
		 int[] arr = {0,1,0,0,0,2,0,1,4,0};
	 }
}
