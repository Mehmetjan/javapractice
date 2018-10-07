package inheritance2;

public class Car {
	
	int  speed;
	int gear;
	
	public Car (int speed, int gear) {
		this.gear = gear;
		this.speed = speed;
	}
    public void breaks(int decreement) {
    	speed-= decreement;
    }
    public void speedUp(int increment) {
    	speed += increment;
    }
    public String toString() {
    	return ("nor of gear are " + gear+ "\n  speed of bycle is "+speed);
    	
    }
}
