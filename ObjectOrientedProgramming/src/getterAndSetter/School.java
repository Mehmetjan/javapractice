package getterAndSetter;

public class School {

	 private int number = 333;
	private String name  = "Clinton School";
	
	public School() {
		System.out.println("total number of students in "+name +"is "+number);
		
	}
	public School(int number, String name) {
		this.number = number;
		this.name = name;
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
