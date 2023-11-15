package com.code;

import java.util.Comparator;

public class SortOnDate implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) 
	{
		if(o1.getRdate().isBefore(o2.getRdate()))
		return -1;
		
		else if(o1.getRdate().isAfter(o2.getRdate()))
			return 1;
		
		else return 0;
		
	}
	

}
