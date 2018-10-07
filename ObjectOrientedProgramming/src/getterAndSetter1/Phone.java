package getterAndSetter1;

public class Phone {
	private int price = 300;
	private String color  = "black";
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
	

}
