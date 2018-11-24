package day5;

public class TelenganaGovt  extends TransportationMinistry{

	public static void main(String[] args) {
		 
		TelenganaGovt ts = new TelenganaGovt();
		ts.airWays();
		ts.waterways();
		ts.railways();
		ts.roadways();
		ts.taxi("UBER");
	}

	 

	public void railways() {
		 
		System.out.println("TS Railways");
		
	}

	 
	public void airWays() {
		System.out.println("TS airways");
		
	}

	 
	public void waterways() {
		System.out.println("TS waterways");
	}

	 
	public void roadways() {
		System.out.println("TS roadways");
		
	}
}
