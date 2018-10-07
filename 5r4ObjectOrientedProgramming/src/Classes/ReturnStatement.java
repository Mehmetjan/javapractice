package Classes;

import java.util.Scanner;

public class ReturnStatement {

	public static void main(String[] args) {

	income();
		
	}
	
	public static void income() {
		int wage, hours;
	
				Scanner pay = new Scanner(System.in);
				System.out.println("please enter the hourly wage: ");
				wage= pay.nextInt();
				System.out.println("please enter the hours you worked: ");
				hours = pay.nextInt();
				
				System.out.println(wage*hours);
//				if (wage<20)
//                return wage*hours;
//							else
//					return 0;
			
			
				 
		
		
		
		
//		return wage;
		
	}

}
