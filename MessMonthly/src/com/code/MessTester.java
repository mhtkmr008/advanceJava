package com.code;

import com.code.ValidateMess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.code.MessUtils.PopulateMap;
import static com.code.ValidateMess.ValidateAllDetails;
import static com.code.MessExceptions.signIn;
import com.code.SortOnDate;

public class MessTester {
	public static void main(String[] args) throws InvalidInputException{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<String,Customer> maps= PopulateMap();	
			boolean status=false;
			while(!status)
			{
				System.out.println("1:SignUp \n2:SignIn\n3:Change Password\n4:Display All Customers\n5:Sort on Mail\n6:Sort on Date\n7:Unsubscribe\n8:Annonomus sort\n9:"
						+ "\nChangeFirstName\n10:Customer registered in June "
						+ "\n11:Count Monthly"
						+ "\n12:Persons Living in Pune"
						+ "\n13:Additional discount"
						+ "\n14:Store on File\nEnter Your Choice");
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter Customer Details FirstName,LastName,Email,password,address,phone Number,registration Date,plan,amount");
						Customer cust=ValidateAllDetails(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),maps);
						break;
						
					case 2:
						System.out.println("Enter EmailId And Password");
						Customer cust1=signIn(sc.next(),sc.next(),maps);
						System.out.println("LoggedIn Successfully");
						break;
						
					case 3:
						System.out.println("Enter EmailId and Password");
						Customer cust2=signIn(sc.next(),sc.next(),maps);
						System.out.println("Enter New Password");
						cust2.setPassword(sc.next());
						System.out.println("Password Changed");
						break;
						
					case 4:
						Iterator<Customer>itr=maps.values().iterator();
						while(itr.hasNext())
						{
							//Customer i=itr.next();
							System.out.println(itr.next());
						}		
						break;
						
					case 5:
						List<Customer>list=new ArrayList<>(maps.values());
						Collections.sort(list);
						list.forEach(p->System.out.println(p));
						break;
						
					case 6:
						List<Customer>list1=new ArrayList<>(maps.values());
						Collections.sort(list1,new SortOnDate());
						list1.forEach(p->System.out.println(p));
						break;
						
					case 7:
						System.out.println("Enter Your Mail and Password");
						String mail=sc.next();
						String pass=sc.next();
						Customer cust3=signIn(mail,pass,maps);
						maps.remove(mail);
						System.out.println("Customer Removed");
						break;
						
					case 8:
						List<Customer>list2=new ArrayList<>(maps.values());
						list2.forEach(p->System.out.println(p));
						Collections.sort(list2,new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								// TODO Auto-generated method stub
								return o1.getRdate().compareTo(o2.getRdate());
							}
							
						});
						list2.forEach(p->System.out.println(p));
						
						break;
						
					case 9:
						for(Customer i:maps.values())
						{
							String name1= i.getFname().substring(0, 1).toUpperCase()+i.getFname().substring(1);
							i.setFname(name1);
						}
						
						break;
						
					case 10:
						for(Customer i:maps.values())
						{
							if(i.getRdate().getMonthValue()==6)
							{
								System.out.println(i);
							}
						}
						break;
					
					case 11:
						long count=maps.values().stream().filter(p->p.getPlan().name().equalsIgnoreCase("monthly")).count();
						System.out.println(count);
						break;
						
					case 12:
						maps.values().stream().filter(p->p.getAddress().equalsIgnoreCase("Pune")).forEach(System.out::println);
						break;
						
					case 13:
						List<Customer>list4=maps.values().stream().filter(p->p.getPlan().name().equalsIgnoreCase("Monthly")).peek(p->p.setfAmount(.8*p.getfAmount())).collect(Collectors.toList());
						for(Customer i:list4)
						{
							System.out.println(i);
						}
						break;
						
					case 14:
						break;
					}
				}catch(Exception e){System.out.println(e);}
			}

		}
}


}
