package day5;

public class AndhraGovt extends TransportationMinistry {

	public static void main(String[] args) {
		
		AndhraGovt e = new AndhraGovt();
		
		e.airWays();
		e.railways();
		e.airWays();
		e.waterways();
		e.taxi("OLA");
		
	}
	 
	public void railways() {
		 
		System.out.println("AP Railways");
		
	}

	 
	public void airWays() {
		System.out.println("AP airways");
		
	}

	 
	public void waterways() {
		System.out.println("AP waterways");
	}

	 
	public void roadways() {
		System.out.println("AP roadways");
		
	}

}
