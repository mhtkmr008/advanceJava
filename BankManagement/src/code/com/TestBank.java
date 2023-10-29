package code.com;
import code.com.ValidateBank;
import static code.com.ValidateBank.ValidateAllDetails;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class TestBank {
	public static void main(String []args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("1:Add account");
			boolean check=false;
			List<Bank>list=new ArrayList<>();
			
			while(check)
			{
				System.out.println("Enter your choice");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("Enter Customer Details accountNumber,uniqueId,name,balance,accType,accnOpenDate");
					Bank person=ValidateAllDetails(sc.next(),sc.nextInt(),sc.next(),sc.nextLong(),sc.next(),sc.next(),list);
					list.add(person);
					System.out.println("Customer added");
					break;
				}
			}
		}catch(Exception e) {System.out.println(e);}
		
	}

	

}
