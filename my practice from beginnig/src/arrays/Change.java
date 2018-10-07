package arrays;

public class Change {

	public static void main(String[] args) {
	int[] nums = {3,4,6,7,4};
	Change1(nums);
	
	for(int d:nums)
	System.out.println(d);
	


	}
	public static void Change1(int[] a) {
		
		for(int i = 0; i<a.length;i++) {
			a[i]+= 4;
		}
	}

}
