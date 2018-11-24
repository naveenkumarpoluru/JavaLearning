package day5;

public interface WaterTribunal {
	
	
	void kaveri();
	void palar();
	
	 default void normal() {
		 System.out.println("This is default method");
	}

}
