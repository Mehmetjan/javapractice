package loops;

public class ContinueLoop {

	public static void main(String[] args) {

		int[] num = {34,45,67,23,22,47};
		for (int i = 1; i<num.length;i++) {
			System.out.println(num[i]);
			if(i == 67) 
				
			continue;
			System.out.println("67 will not be printed");
			break;
		}
		
		
	}
}
