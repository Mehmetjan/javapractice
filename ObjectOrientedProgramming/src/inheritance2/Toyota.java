package inheritance2;

public class Toyota extends Car {
	public int height;

	public Toyota(int speed, int gear, int startHeight) {
		super(speed, gear);
		 height = startHeight;
	}

    public void setHeight(int newheight) {
    	
		newheight = height;

	}
    @Override
    public String toString() {
    	return(super.toString()+ "  add the height "+ height);
    }

}
