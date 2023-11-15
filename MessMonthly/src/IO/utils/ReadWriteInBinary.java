package IO.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.code.Customer;

public class ReadWriteInBinary {

	public static void StoreInBinary(String filename,Map<String,Customer>maps) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(maps);
			System.out.println("Data Stored Sucessfully");
		};
	}
	
	public static void RestoreFromBinary(String filename) throws IOException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			Map<String,Customer>maps=(Map<String,Customer>)in.readObject();
			maps.values().forEach(p->System.out.println(p));
		} catch (Exception e) {
			e.printStackTrace();
		};
	}
}
