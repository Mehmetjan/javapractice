package Classes;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		
		myArray1();
		
	
		
	}
		

	public static int[] myArray1() {
		int a[] = new int[3];
		
		for (int i = 0; i< a.length; i++) {
			a[i] = i+2;
		}
		
		System.out.println("please enter an intergeer: ");
		Scanner b = new Scanner(System.in);
		int r  = b.nextInt();
		
		
				
		System.out.println(a[r]);
		
		return a;

	
	}

}
