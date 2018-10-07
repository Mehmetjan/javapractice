package constructorHandling;

import java.util.Scanner;

public class Schools {

	public static void main(String[] args) {
		Elementary children = new Elementary();
		children.num = 4500;
		
		Scanner enter = new Scanner(System.in);
		System.out.println("please enter the age of the first child: ");
		children.age = enter.nextInt();
		if(children.age<14) {
			
			System.out.println("please enter the gender of first child: ");
		} else
		{System.out.println("the students is overaged");  
				}
		
		Scanner inGender = new Scanner(System.in);
		
		children.gender = inGender.nextLine();
		
		System.out.println("total number of the children  in elementary school is "+ children.num+", num of male children is "+ (children.num-300));
	}

}
