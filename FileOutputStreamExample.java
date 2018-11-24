package day6;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {

		try {
			String path = "//Files//Examples";

			FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir")+path);

			String s = "Welcome to Java Class.";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
