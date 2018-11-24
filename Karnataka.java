package day5;

public class Karnataka  implements WaterTribunal,GreenTribunal{

	public static void main(String[] args) {
		Karnataka kr = new Karnataka();
		kr.kaveri();
		kr.palar();
		kr.normal();
		kr.reserveForest();
 
		EncapsulationDemo e =  new EncapsulationDemo();
		e.setAge(20);
		e.setCity("Bangalore");
		e.setName("Aravinda");
	 
		System.out.println(e.getAge() +"----"+ e.getCity() +"----"+ e.getName());
		
		
		
	}

	 
	public void kaveri() {
	 
	System.out.println("100 Cubic Liter Water");	
	}

 
	public void palar() {
		System.out.println("30 Cubic Liter Water");
		
	}


	public void reserveForest() {
		 System.out.println("Dont destroy tree in forest");
		
	}

}
