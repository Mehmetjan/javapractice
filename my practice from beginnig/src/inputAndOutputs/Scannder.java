package inputAndOutputs;

import java.util.Scanner;

public class Scannder {

	public static void main(String[] args) {
	Scanner IntNum = new Scanner(System.in);
	System.out.printf("please enter a double number: ");
	int myNum = IntNum.nextInt();
	System.out.printf("you entered: %d.%n%n",myNum );
	
	Scanner doubleNum = new Scanner(System.in);
	System.out.println("please enter a double number: ");
	int myDouble = doubleNum.nextInt();
	System.out.printf("u entered doule number %.2f.%n%n",myDouble);
	 
	}

}
