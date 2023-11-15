package com.code;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.code.Customer;

public class MessUtils {
	
	public static Map<String,Customer> PopulateMap()
	{
		Map<String,Customer>maps=new HashMap<String,Customer>();
		
		maps.put("mhtkmr008@gmail.com",new Customer("Mohit","Kumar","mhtkmr008@gmail.com","123","Pune","7979970814",LocalDate.parse("2023-06-06"),Plan.MONTHLY,80000));
		maps.put("triptikomal2@gamil.com",new Customer("Tripti","Komal","triptikomal2@gmail.com","123","pune","9903070158",LocalDate.parse("2023-07-05"),Plan.QUARTERLY,11700));
		maps.put("mayankmadhur@gmail.com",new Customer("mayank","madhur","mayankmadhur@gmail.com","123","baroda","9279038584",LocalDate.parse("2023-02-15"),Plan.HAFLYEAR,17500));
		return maps;
	}

}
