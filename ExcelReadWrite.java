package day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExcelReadWrite {
	
	public static void main(String[] args) throws IOException {
		String path = "//Users//aravindanathdm//eclipse-workspace//JavaClass//Files//object.properties";
		Properties prop = new Properties();
		FileInputStream fis =  new FileInputStream(path);
		prop.load(fis);
		String excelPath = prop.getProperty("excelPath2");
	//	System.out.println("Excel File path: "+ excelPath);
		Xls_Reader xls = new Xls_Reader(excelPath);
		//System.out.println(xls.getCellData("Record", "Name", 2));;
		System.out.println( xls.getRowCount("Record"));;
		xls.setCellData("Record", "Name", 8, "Lakshmi");
		xls.setCellData("Record", "City", 8, "Mysore");
		 
		try {
			int i = 1;
			int b = 1;
			int s = i/b;
			xls.setCellData("Record", "Status", 2, "Pass");
		} catch (Exception e) {
			xls.setCellData("Record", "Status", 2, "Fail");
			
		}
		
	}

}
