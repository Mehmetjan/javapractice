package keyWords;

public class Split {

	public static void main(String[] args) {
		names();
		

	}
	public static void names() {
		String names  = " peter, john, jack, jolliet";
		
	String[] splitname = names.split(",");
//		String[] splitname1 = names.split("jack");
		  
		System.out.println(splitname);
		 
	
	}

}
