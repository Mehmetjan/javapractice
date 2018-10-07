package method;

public class Length2 {

	public static void main(String[] args) {
	 
		studnet();
		teachers();
		parents();
		child();
		
	}
     public static void studnet(){
    	 String name  = "maimaitijiang abu";
    	int LastName = "maimaitijiang abu".length();		 
    	  System.out.println("my name is "+",my last name is "+LastName);
      }
      
    public static void teachers() {
    	int age = "his age equel to subtract my brother's age".length();
System.out.println(age);
    }
    public static void parents() {
    	String story = "you are god damned stuped idio".substring(8);
    	System.out.println(story);
    }

 public static void child() {
	 char chilndName  = "cute baby".charAt(5);
	 
	 System.out.println(chilndName);
	 
 }
}