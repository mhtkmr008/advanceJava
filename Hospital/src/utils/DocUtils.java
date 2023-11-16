package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CustomExecption.InvalidInputExc;
import core.app.Department;
import core.app.Doctor;

public interface DocUtils {
	
 public static List<Doctor> populateList() {
	List<Doctor>drs=new ArrayList<>(Arrays.asList(
			new Doctor("Pragya","MBBS","Pragya5719@gmail.com","12345678",12,100000,LocalDate.parse("2021-06-21"),
					Department.valueOf("Ortho".toUpperCase())),
			new Doctor("Jai","MBBS","Jai1234@gmail.com","12345678",5,80000,LocalDate.parse("2021-06-21"),
					Department.valueOf("Ortho".toUpperCase())),
			new Doctor("Ankit","MBBS","Ankit1234@gmail.com","12345678",15,96000,LocalDate.parse("2015-02-21"),
					Department.valueOf("PHYSIOTHERAPY".toUpperCase())), 
			new Doctor("Pawan","MBBS","Pawan1234@gmail.com","12345678",6,50000,LocalDate.parse("2020-11-15"),
					Department.valueOf("PEDIATRICS".toUpperCase())),
			new Doctor("Amit","MBBS","Amit1234@gmail.com","12345678",2,78000,LocalDate.parse("2005-06-11"),
					Department.valueOf("PHYSIOTHERAPY".toUpperCase()))));
	
	return drs;
 }
 
 // validates login data
 static boolean validData(String email,String pass,List<Doctor>drs) throws InvalidInputExc
 {
	 for(Doctor doc:drs) {
		 if(doc.getEmail().equals(email))
		 {
			 if(doc.getPass().equals(pass))
				 return true;
			 else
            	 throw new InvalidInputExc("Password is wrong");
		 }
		 else
			 throw new InvalidInputExc("Email dosen't exists");

    }
	   return false; 
 }
 
 // shows the highest earning doctor
 static void showDoc(List<Doctor>drs)
 {
	Doctor doc=drs.stream()
	.max((d1,d2)->((Double)d1.getSal()).compareTo(d2.getSal()))
	.orElseThrow();
	 
	System.out.println(doc.getdName()+","+doc.getEmail());
 }
 
 static List<Doctor> sortDoc(List<Doctor>drs)
 {
	drs.sort((d1,d2)->((Integer)d2.getExp()).compareTo(d1.getExp()));
	return drs;
 }
 
 static void showOrtho(List<Doctor>drs)
 {
	 for(Doctor doc:drs)
	 {
		 if(doc.getDept()==Department.ORTHO)
			 System.out.println(doc);
		 
	 }
 }
 
}
