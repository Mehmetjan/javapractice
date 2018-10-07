package practice1;

public class Methods {
public static void main(String[] args){
	int StNo=234;
	String address;
	address= "1420 K St, Suit 350";
	System.out.println("Street number is: "+StNo+" and "+address);
	teachers();
	students(40,"4026 Barbour dr");
	
	
	
}

public static void students(int StNo, String address){
	//int StNo = 22;
	//String address = " 1420 K St";
	System.out.print("Street number is: "+StNo+" and "+address);
	
}
public static void teachers() {
	String address = "23 Barbour Dr";
	int number = 45;
	System.out.println("teacher's address is "+address+" , and they will be about"+number+" people");
	
}
}
