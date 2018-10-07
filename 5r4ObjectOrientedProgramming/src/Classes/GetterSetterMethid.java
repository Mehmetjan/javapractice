package Classes;

public class GetterSetterMethid {
  public static void main() {
	OverloadedConstructor obj1 = new OverloadedConstructor();
	OverloadedConstructor obj2 = new OverloadedConstructor(3);
	OverloadedConstructor obj3 = new OverloadedConstructor(3,33);
	OverloadedConstructor obj4= new OverloadedConstructor(4,45,34);
	  System.out.println(obj2.getAge()+"this is it");
	
	 
	}
}

