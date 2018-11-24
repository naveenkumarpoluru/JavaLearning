package day5;

public interface TodaysClass {

	abstract void test();

	void test1();

	default void test3() {
		System.out.println("This is a default method!");
	}

}
