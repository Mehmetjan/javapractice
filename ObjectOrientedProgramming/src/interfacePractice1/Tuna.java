package interfacePractice1;

public class Tuna implements Fish{
	public int size;
    public	int weight;
    public	int length;


	public int getSize() {
		return size;
	}

	public void setSize(int newSize) {
		size  = newSize;
		newSize = 4;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	
	}

	@Override
	public void weight() {
		System.out.println("weight of the tuna is: ");
		
	}

	@Override
	public void length() {
		System.out.println("length of the tuna is: ");
		
	}
	@Override
	public void size() {
		System.out.println("size of the tuna is: ");
		
	}
}
