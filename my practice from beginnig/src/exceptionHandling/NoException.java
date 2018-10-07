package exceptionHandling;

import java.util.Scanner;

public class NoException {

	public static void main(String[] args) {
		Scanner devide = new Scanner(System.in);
		System.out.println("please enter numerator: ");
		int numerator = devide.nextInt();
		System.out.println("please nete rdeno: ");
		int deno = devide.nextInt();
		
		System.out.println("the result of the devision is: "+numerator/deno);

	}

}
