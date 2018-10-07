package Classes;

public class PrivateField{

	 static int age=20;
	
	public static void main(String[] args) {
		age = 40;
System.out.println(age);
 
       
	}
	public void gon() {
		this.age = 21;
		
	}
}

