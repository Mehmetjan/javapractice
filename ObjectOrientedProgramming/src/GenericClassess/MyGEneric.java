package GenericClassess;

public class MyGEneric<T> {
	private T MyVar;

	public void setMyVar(T i) {
		MyVar = i;
	}
	void printMyValue() {
		System.out.println("the value of my variable is :"+MyVar);
	}
	

}
