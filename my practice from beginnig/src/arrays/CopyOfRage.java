package arrays;

import java.util.Arrays;

public class CopyOfRage {

	public static void main(String[] args) {
//	 String[] carModel = new String[] {"toyota","Nissan","Wolswagen"};
//	 String[] carModel2 = Arrays.copyOfRange(carModel,"toyota","Nissan");
		address();
	}
	
	public static void address(){
		int[] ages = new int[] {1,3,4,5,3,5,6,66};
		int[] ages2 = Arrays.copyOfRange(ages,1,5);
		System.out.println(ages2[3]);
		
	}

} 
 