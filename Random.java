package day3;

public class Random {

	public static void main(String[] args) {
		
//		Math.random();
//		System.out.println("RANDOM NUMBER "+	Math.random());

		//double ran =  Math.random();
//		int ran = (int) (Math.random()*999999999);
		int ran = (int) (Math.random()*9990999);
		System.out.println(ran);
		
		MethodCalling m = new MethodCalling();
		m.wheel();
		m.car();
	}

}
