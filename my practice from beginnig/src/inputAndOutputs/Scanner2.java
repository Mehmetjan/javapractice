package inputAndOutputs;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
	 	 
		
		
		Scanner userName = new Scanner(System.in);
	 	 System.out.println("please enter your username: ");
	 	 String username = userName.nextLine();	 	 
	 	Scanner MyPassword = new Scanner(System.in);
	 	 System.out.println("please enter you password: ");
	 	 String password = MyPassword.nextLine();

	 	 if ( username.equals("bugra") && password.equals("mbmb15")) {
	 		 System.out.println("welcome !");
	 	 }
	 	 else {
	 			 System.out.println("you entered a wrong username or password, please try again !");
	 		 }
	 		 
	 	 }
	 	 

	}


