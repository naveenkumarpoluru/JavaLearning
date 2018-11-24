package day4;
///By changing number of arguments

public class MethodOverloadingChangeOfArg {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
