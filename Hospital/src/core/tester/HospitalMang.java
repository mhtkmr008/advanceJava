package core.tester;

import static utils.DocUtils.*;

import java.util.List;
import java.util.Scanner;

import CustomExecption.InvalidInputExc;
import core.app.Doctor;
import static utils.docInfoValid.*;

public class HospitalMang {

	static void show(List<Doctor>drs)
	{
		for(Doctor Doc:drs)
		{
			System.out.println(Doc);
		}
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			List<Doctor>drs=populateList(); //List gets populated
			boolean exit=false; // flag for the while
			boolean status=false; // flag for log in
			Doctor doc;
			
			show(drs);
			
			while(!exit)
			{			
				try
				{
					// User login
					if(!status)
					{
						System.out.println("Enter the Email id and Password:");
						    
						status=validData(sc.next().toLowerCase(),sc.next(),drs);
						
						System.out.println("You are loged in");
				
					}
				    
					// if login is successful then only we can perform below performance
					if(status)
  					{
						System.out.println("\nOption: \n1.Add record \n2.See the most paid doctor "
								+ "\n3.See doctors acc to experience \n4.Show Orhopedics doctor "
								+ "\n5.See all doctors \n6.exit");
						
					   switch(sc.nextInt())
					   {
					     // Adds the validated record to the list
					      case 1:
					         
					    	  System.out.println("Enter the Doctor Data Name,Degree,Email,Password,Experience,"
					    	  		+ "Salary,Joining Date,Department");
					    	  
					    	  doc=validateInfo(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.next(),sc.next(),drs);
					    	  
					    	  drs.add(doc);
					    	  System.out.println(doc);
					    	  
					    	 System.out.println("Data is stored");
					    	 
					    	 break;
					    	 
					     // shows the highest paid doctor	 
					      case 2:
					    	  System.out.println("Highest earning doctor");
					        showDoc(drs);
					        
					        break;
					        
					     // doctors sorted in the experience order
					      case 3:
					    	  
					    	  System.out.println("Doctors on the basis of experience");
					    	  
					    	  drs=sortDoc(drs); // list get sorted
					    	  
					    	  show(drs);
					   
	                           break;
	                           
					      case 4:
					    	  
					    	  System.out.println("All Orthopedics doctor");
					    	  
					    	  showOrtho(drs);
					    	  
					    	  break;
					    	  
					      case 5:
					    	   
					    	  show(drs);
					    	  
					    	  break;
					    	  
					      case 6:
					    	  
					    	  System.out.println("EXIT");
					    	  
					    	  exit=true;
					      
					          break;
					       
					       default:
					    	   
					    	   System.out.println("Wrong input, Please try again.");
					   }
						
					}
					
				}
				catch (InvalidInputExc id)// catches the custom exc
				{
				   id.printStackTrace();
				}
				
				catch(Exception e) //catches the random exc
				{
					e.printStackTrace();
				}
			}

		}
	}
}
