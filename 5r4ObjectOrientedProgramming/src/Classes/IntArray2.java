package Classes;

import java.util.Scanner;

public class IntArray2 {

	public static void main(String[] args) {
		secondArray();
		
	
			
	}
	
	public static int[] secondArray() {
		int c[] = new int[5];
		
		for (int i  = 0; i<c.length; i++) {
			 c[i]  = i+3;
			 System.out.println("pleae enter and number that smaller than 5: ");
				
				Scanner b = new Scanner(System.in);
				int f = b.nextInt();
				System.out.println(i);
		}
		return secondArray();
		
		
				}



}
