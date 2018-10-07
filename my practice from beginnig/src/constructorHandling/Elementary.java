package constructorHandling;

public class Elementary {
  public int num;
  public int age;
  public String gender;
  
  public int calculateAge (int ageInElementary, int ageOfChildhood) {
	  age = ageInElementary+ageOfChildhood;
	  return (ageInElementary+ageOfChildhood);
	  
  }
  
  public Elementary() {
	  System.out.println("let us calculate the total number of students in elementary school");
  }
  
  
}
