package day5;

public class TestRbiGuidelines {

	public static void main(String[] args) {
		 
		SBI s = new SBI();
		s.kyc();
		s.pos();
	//	s.normalCharges();
		System.out.println("***********************");
		
		ICICI i = new ICICI();
		i.kyc();
		i.pos();
		i.normalCharges();
		
	}

}
