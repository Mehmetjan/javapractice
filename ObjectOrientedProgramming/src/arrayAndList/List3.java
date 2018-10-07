package arrayAndList;
import java.util.ArrayList;

public class List3 {

	public static void main(String[] args) {
		Integer [] age = {23,34,24,35,22,21,31,40};
 		
 	ArrayList<Integer>  num = new ArrayList<>();
      for (Integer a: age)
    	 num.add(a);
       System.out.println(num);
       
        
	}

}
