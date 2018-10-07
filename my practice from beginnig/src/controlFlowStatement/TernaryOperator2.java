package controlFlowStatement;

public class TernaryOperator2 {

	public static void main(String[] args) {

//    int age =34;
//      if(34>63)
//    	  age = 30;
//      else
//    	  age  = 20;
      
      
      int age = 34>33 ? 30:20;
      
      System.out.println(age);
      num();
    
	}
	public static void num(){
	int compare = 3>4 ? 12:34;
	System.out.println(" your age is : "+compare);
	}

}
