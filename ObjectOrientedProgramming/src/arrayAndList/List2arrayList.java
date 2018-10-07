package arrayAndList;
import java.util.ArrayList;

public class List2arrayList {

	public static void main(String[] args) {
     String []  pet = {"dog", "cat", "forg", "lion"};
     ArrayList<String> petList = new ArrayList<>();
     for(String p: pet)
    	 petList.add(p);
     
     System.out.println(petList);

	}

}
