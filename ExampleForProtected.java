package day6;

import java.util.Date;

import day5.*;

 class ExampleForProtected extends DummyClassForProtectedEx {
	public static void main(String[] args) {
		DummyClassForProtectedEx d = new DummyClassForProtectedEx();
	//	d.msg();
		
		Date da = new Date();
	//	da.getHours();
		System.out.println(da.toLocaleString());
	}

}
