package day5;

public class EncapsulationDemo {
	private int age;
	private String name;
	private String city;

	

	public void setCity(String city) {
		this.city = city;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}


}