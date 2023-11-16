package utils;

import java.time.LocalDate;
import static java.time.LocalDate.parse;
import java.util.List;
import java.util.regex.Pattern;

import CustomExecption.InvalidInputExc;
import core.app.Department;
import core.app.Doctor;

public interface docInfoValid {
	
	// checking if email is valid and duplicate or not
	static void validEmail(String email,List<Doctor>drs)throws InvalidInputExc
	{
		String pattern="^[a-z A-Z 0-9 -+&_*]+@[a-z]*\\.(com|org|net)";
		
		if(matches(email,pattern))
		{
		for(Doctor doc:drs)
			if(doc.getEmail().equals(email))
			throw new InvalidInputExc("Email already exists.");
		}
		else
			throw new InvalidInputExc("Invalid email");
	}
	
	static boolean matches(String email, String pattern) {
		// TODO Auto-generated method stub
		return false;
	}

	// checks if dept is valid or not
	static Department validDept(String dept)throws IllegalArgumentException
	{
	    return Department.valueOf(dept.toUpperCase());	
	}
	
	// checks if date is valid 
	static LocalDate validDate(String jdate) throws InvalidInputExc
	{
	     LocalDate Date=parse(jdate);
	     
	     if(Date.isBefore(parse("2001-05-10")))
	    	 throw new InvalidInputExc("Joining Date is before 10th may 2001.");
	     
	     return Date;
	}
	
	//Receives all the data inputs by user and checks all criteria and then stores it
	static Doctor validateInfo(String dName, String deg, String email, String pass, int exp, double sal,String jdate,
			String dept,List<Doctor>drs)throws IllegalArgumentException,InvalidInputExc
	{
		 validEmail(email,drs);
		 
		 Department dpt=validDept(dept);
		 
		 LocalDate jDate=validDate(jdate);
		
		return new Doctor(dName,deg,email,pass,exp,sal,jDate,dpt);
	}
	

}
