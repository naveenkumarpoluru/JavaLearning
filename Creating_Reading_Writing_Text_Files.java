package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Creating_Reading_Writing_Text_Files {

	public static void main(String[] args) throws IOException     {
		
		String path = "//Users//aravindanathdm//eclipse-workspace//JavaClass//Files//temp.txt";
		// creating a new file 
		File f =  new File(path);
		f.createNewFile();
		// writing
		FileWriter w = new FileWriter(path);
		BufferedWriter out = new BufferedWriter(w);
		out.write("hello we are writing in a file");
		out.newLine();
		out.write("This is a new line");
		out.flush();
		//reading
		FileReader r = new FileReader(path);
		BufferedReader bfr = new BufferedReader(r);	
		String x ="";
		
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		
		
		while((x = bfr.readLine()) != null){
			System.out.println(x);
		}
			
		}
	}


