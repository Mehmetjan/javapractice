package arrayAndList;
import java.util.ArrayList;
public class MyArrayList {

	public static void main(String[] args) {
	
	 
	ArrayList<String> name  = new ArrayList<String>();
	ArrayList<Integer> no = new ArrayList<>();
	
	name.add("mehmet");
	name.add("aslam");
	name.add("nadia");
	no.add(23);
	no.add(43);
	no.add(33);
	
	name.set(2,"ablikim");
	no.set(0,35);
	no.get(1);
	
	
	System.out.println(name);
	System.out.println(no);
    
	System.out.println("there are "+name.size()+" names");
	System.out.println("there "+no.size()+" numbers");
	 
}

}
