package Classes;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		
		calcutePay();
	 
	}
	public static int calcutePay() {
		int workedHours, HourlySalary;
		Scanner in = new Scanner(System.in);
	   System.out.println("please enter hours you worked: ");
	   workedHours = in.nextInt();
	   System.out.println("please enter your hourly salary: ");
	   HourlySalary = in.nextInt();
				
	   int staffPay = workedHours*HourlySalary;
	  if (workedHours>2)
		  return staffPay;
	  else
		  return -1;
	
		
	}
	
	

}






/*
 1. What are getter and setter?

In Java, getter and setter are two conventional methods that are used for retrieving and updating value of a variable.
The following code is an example of simple class with a private variable and a couple of getter/setter methods:


public String name = "Shamik";
// caller:
String name = X.name;   //(X is a object instance);
X.name = "Shamik Mitra";


int num = obj.getNumber();  // fine
 So, a setter is a method that updates value of a variable. And a getter is a method that reads value of a variable.
 */
