package keyWords;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner Num = new Scanner(System.in);
		System.out.println("please enteer education level: " );
		int num = Num.nextInt();
		switch (num)
		{
			case 1:
				System.out.println("elementary school");
		break;
		
			case 2:
				System.out.println("middle school");
		break;
			case 3:
				System.out.println(" high school");
		break;
			case 4:
				System.out.println("college");
		break;
			case 5:
				System.out.println("university");
		break;
		
		default:
			System.out.println("i think you did not attend any school in you whole life");
		}
	
	}

}
