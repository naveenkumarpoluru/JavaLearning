package day7;

import java.io.File;
import java.io.IOException;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class IniReadWrite {

	public static void main(String[] args) throws InvalidFileFormatException, IOException {

	//	String d = getValueByKey("TestCase2", "username");
	//	System.out.println(d);
	
		System.out.println(getValueByKey("testcase3", "password"));
		setValue("testcase2", "products", "Reebokbag");
		
	}

	public static void setValue(String title, String Key, String parameterName) throws IOException {
		Ini ini = new Ini(new File(System.getProperty("user.dir") + "//Files//testData.ini"));
		ini.put(title, Key, parameterName);
		ini.store();
	}

	public static String getValueByKey(String gettitle, String getKey) throws InvalidFileFormatException, IOException {
		Ini ini = new Ini(new File(System.getProperty("user.dir") + "//Files//testData.ini"));
		String value = ini.get(gettitle, getKey);
		if ((value == null)) {
			System.err.println("Enter Proper Title or Key!");
		}
		//System.out.println(getKey + "-->" + value);
		return value;
	}

}
