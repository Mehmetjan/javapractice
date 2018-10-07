package inheritance1;

public class NormalMember extends Member {
	public static void main(String[] args) {
		
	
	}

	public NormalMember() {
		System.out.println("child class with no constructor");
	}
	
	public NormalMember(String pName, int pMemberID, int pMemberSince){
		super(pName,pMemberID,pMemberSince);
		System.out.println("child cosntructor with 3 parameters");
//		NormalMember myChildMembers = new NormalMember("James", 1,23);
	}
	@Override
	public void calculateAnnualFee() {
	annualFee =  (1+0.02*getDiscount())*(1000+12*30);
	}
	
	

}

