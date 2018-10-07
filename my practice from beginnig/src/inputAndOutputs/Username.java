package inputAndOutputs;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
	
		Scanner Username = new Scanner(System.in);
		System.out.println("please ente your username: ");
		String username = Username.nextLine();
		
		Scanner Password = new Scanner(System.in);
		System.out.println("please ente your password: ");
		String password = Password.nextLine();
		
		
	if (username.equals("bugra")&& password.equals("861115")) {
		System.out.println("Welcome "+ username +"!");
	}else {
		System.out.println("you entered wrong username or password ! \n please try again !");
	}
		
		
		
	}

}
