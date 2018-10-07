package getterAndSetter1;

public class Blackberry {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.setColor("blue");
		p1.setPrice(450);
		
		System.out.println("my phoen is Blackberry, price is "+p1.getPrice() +", color is "+p1.getColor());

	}

}
