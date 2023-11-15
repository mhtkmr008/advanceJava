package IO.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import com.code.Customer;

public class ReadWriteInChar {
	
	public static void StoreInFile(String filename,Map<String,Customer>maps) throws IOException 
	{
		try(PrintWriter pw=new PrintWriter(new FileWriter(filename))){
			maps.values().stream().forEach(p->pw.println(p));
			System.out.println("Data Stored Successfully");
		};
	}
	
	public static void RestoreFromFile(String filename)throws IOException
	{
		try(BufferedReader br=new BufferedReader(new FileReader(filename))){
			br.lines().forEach(System.out::println);
			System.out.println("Data Restored Successfully");
		};
	}
}
