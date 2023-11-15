package com.code;

import java.util.Map;
 
public class MessExceptions {
	
	public static Customer signIn(String email,String password,Map<String,Customer>maps)throws InvalidInputException
	{
		Customer c=null;
		for(Customer i:maps.values())
		{
			System.out.println(i);
			if(i.getEmail().equals(email))
			{
				System.out.println("emailok");
				if(i.getPassword().equals(password))
				{
					System.out.println("passok");
					c=i;
					break;
				}
				else
					throw new InvalidInputException("Password not correect");
			}
			
		}
		
		if(c==null)
			throw new InvalidInputException("EmailId Not Found");
		return c;
	}

}
