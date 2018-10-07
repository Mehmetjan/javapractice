package inputAndOutputs;

import java.util.Scanner;
public class IfStatement {

	private static Scanner enter;

	public static void main(String[] args) {
		enter = new Scanner(System.in);
		System.out.println("please enter your age: ");
		int age = enter.nextInt();
		if (age<0 || age>100) {
			System.out.println("you entered an invalid age");
		}
		else if(age<18){
			System.out.println("sorry, you are too young, you may not enter");
		}
		else if(age<21) {
			System.out.println("hi, you may enter, but must be with you parents");
					}
		else {
			System.out.println("congratulagion,you can enter\n enjoy the party!");
		}

	}

}
