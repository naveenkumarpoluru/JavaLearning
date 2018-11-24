package day5;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("Begin of the code...");

		try {
			int data = 50 / 0;
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("Finally");
		}

		// try {
		// int data = 50 / 0;
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println(data);
		// System.out.println("Begin of the code...");

		// try {
		// int data = 50 / 0;
		//
		// throw new ArithmeticException("Hey Zero can't divide 50...!");
		// }
		// catch (Exception e) {
		// // TODO Auto-generated catch block
		// throw new ArithmeticException("Hey Zero can't divide 50...!");
		// //e.printStackTrace();
		// }
		// finally {
		// System.out.println("closing connections");
		// }

		// try {
		// int data = 50 / 0;
		//
		// } catch (Exception e) {
		//
		// e.printStackTrace();
		// System.out.println(e);
		// }
		System.out.println("rest of the code...");
		// throw new ArithmeticException("Hey Zero can't divide 50...!");
	}

}
