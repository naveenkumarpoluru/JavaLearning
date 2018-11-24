package day4;

public class TestingMethodOverLoading {

	 public static void main(String[] args) {
	 MethodOverloadingChangeOfArg ma = null;
	 System.out.println("Method Overloading ChangeOfArg");
	 System.out.println("Add two numbers: " + ma.add(11, 23));
	 System.out.println("Add three numbbers: " + ma.add(44, 112, 11));
	
	 MethodOverloadingChangeOfDataTypes mc = null;
	 System.out.println();
	 System.out.println("****************************************");
	 System.out.println();
	 System.out.println("Method Overloading ChangeOf Data types");
	 System.out.println("Add two numbers: " + mc.add(11, 23));
	 System.out.println("Add three numbbers: " + mc.add(44.0, 11.012));
	
	 }
	
}
