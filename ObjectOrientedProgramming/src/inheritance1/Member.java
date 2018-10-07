package inheritance1;
import java.util.Scanner;

public class Member {
	public String wolcome = "welcome everyone";
	protected double annualFee;
	private String name;
	private int memberID;
	private int memberSince;
	private int discount;
	public static void main(String[] args) {
		NormalMember mem1 = new NormalMember();
		VIPMember mem2 = new VIPMember("Julia", 48, 320);
			
	}
	
	public Member(){
		System.out.println("parent constructor with no parameter");
		
	}
	public Member(String pName, int pMemberID,int pMemberSince) {
		System.out.println("parent constructor with three paramenters");
		name = pName;
		memberID = pMemberID;
		memberSince = pMemberSince;
		
		
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount() {
	   Scanner input = new Scanner(System.in);
	   String password;
	   System.out.println("please enter your password");
	   password = input.nextLine();
	   if (password.equals("abc123")) {
		   System.out.println("please enter discount");}
		   else {
			   System.out.println("you entered wrong password, you can not calculate the discount");
			   discount = input.nextInt();
			   System.out.println("you entered discount rate : "+discount);
		   }
		  
	   }
	
	public void displayInfo() {
		System.out.println("member name:" + name);
		System.out.println("memebr ID: "+memberID);
		System.out.println("memebr since: "+memberSince);
		System.out.println("discoount: "+discount);
	}
	
	
	public void calculateAnnualFee() {
		discount = 0;
	}
	
	
			   }
	
	
	


