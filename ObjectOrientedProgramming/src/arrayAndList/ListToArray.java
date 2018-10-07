package arrayAndList;
import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		String name[] = {"john", "keven", "michael","jack"};
		
		ArrayList<String> names = new ArrayList<>();
		
		for (String i:name)
			names.add(i);
		
		System.out.println(name[3]);
		System.out.println(names);
	}

}
