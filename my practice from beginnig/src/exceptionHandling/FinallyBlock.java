package exceptionHandling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    try
		{ System.out.println("please enter numerator: ");
	      int numer = in.nextInt();
	      System.out.println("please enter deno: ");
	      int deno = in.nextInt();	      
	      System.out.println("the result is :"+ numer/deno);
		}
	    catch (Exception e)
	    { System.out.println(e.getMessage()); 
	    	
	    }
	    finally {System.out.println("** the exception handled properly **");
		
	}

}
}