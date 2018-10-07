package arrays;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
    String[] Courses;
    Courses = new String[] {"history, literature, art"};
    
    String agenda[] = new String[] {"art, history, literature"};
    boolean same = Arrays.equals(agenda, Courses);
    if (agenda.equals(Courses)){
    	
    
    	System.out.println("it is true");
    }else
    {System.out.println("it is not same");
    
    }
    esit();

	}
public static void esit(){
	int age[] = new int[] {34,23,45,55};
	int age2[] = new int[] {34,23,45,55};
	boolean as = Arrays.equals(age, age2);
	
	System.out.println(age);
	
}
}
