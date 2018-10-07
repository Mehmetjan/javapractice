package inheritance1;

public class VIPMember extends Member{
	public VIPMember(String pName, int pMemberID, int pMemberSince) {
		super(pName, pMemberID, pMemberSince);
		System.out.println("this is child doctructor with the parameters");
	}
	@Override
	public void calculateAnnualFee() {
		annualFee = (1-0.05*getDiscount())*1200;
	}

}
