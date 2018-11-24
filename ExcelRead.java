package day7;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {

		//File f = new File("//Users//aravindanathdm//eclipse-workspace//JavaClass//Files//TestData.xls");
		FileInputStream fi = new FileInputStream("//Users//aravindanathdm//eclipse-workspace//JavaClass//Files//TestData.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		HSSFSheet sheet = wb.getSheetAt(0);
		String stvalue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Sheet value :" + stvalue);
		String val = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Sheet value :" + val);
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total row count: " + rowCount);
		for (int i = 0; i < rowCount; i++) {
		//	System.out.println(i);
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			String data1 = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data + " " + data1);
		}

		wb.close();
		
	}

}
