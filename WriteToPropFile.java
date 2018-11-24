package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteToPropFile {

	public static void main(String[] args) throws IOException {
		 
		
		Properties prop = new Properties();
		OutputStream output = null;
		
		output = new FileOutputStream("/Users/aravindanathdm/eclipse-workspace/JavaClass/Files/config.properties");

		// set the properties value
		prop.setProperty("City", "Coloumus");
		prop.setProperty("Name", "Sandhya");
		prop.setProperty("State", "ohio");

		// save properties to project root folder
		prop.store(output, null);
		
		
		FileInputStream fis = new FileInputStream("/Users/aravindanathdm/eclipse-workspace/JavaClass/Files/config.properties");
		prop.load(fis);
		System.err.println(prop.getProperty("City"));
		System.err.println(prop.getProperty("State"));
		System.err.println(prop.getProperty("Name"));
	}

}
