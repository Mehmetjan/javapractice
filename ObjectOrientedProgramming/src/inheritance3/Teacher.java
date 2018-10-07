package inheritance3;

public class Teacher {

	public static void main(String[] args) {
		
		Person MathTeacher[] = new Person[2];
		MathTeacher[0] = new Employees();
		MathTeacher [1] = new Worker();
		
		for (int i = 0; i<3; ++i) {
			MathTeacher[i].work();
		}
		
		
		

	}

}
