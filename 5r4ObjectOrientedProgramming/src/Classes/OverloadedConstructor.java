package Classes;

public class OverloadedConstructor {

	private int number;
		private int age;
	private  int hight;
 
public OverloadedConstructor() {
	this(0,0,0);
	int age;
	}

public OverloadedConstructor(int number) {
	this(number,0,0);
	}

public OverloadedConstructor(int number,int age) {
	this(number,age,0);
	
}
public OverloadedConstructor(int number,int age, int hight) {
	setNum(number,age,hight);

}

private void setNum(int number, int age, int hight) {
 
//	setNumber(number);
//	setAage(age);
//	setHight(hight);
}


public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
	number = (number>0 && number<100 )? number:0;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getHight() {
	return hight;
}

public void setHight(int hight) {
	this.hight = hight;
}

 
	
}


