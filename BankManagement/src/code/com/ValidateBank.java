package code.com;
import code.com.Bank;
import code.com.BankInvalidInputException;

import code.com.Account;

import java.time.LocalDate;
import java.util.List;

import com.iacsd.core.Color;

public class ValidateBank {
	
	private static void CheckAndValidateAccountNumber(String accountNumber, List<Bank> list)throws BankInvalidInputException
	{
		Bank b1=new Bank(accountNumber);
		if(!(list.contains(b1)))
		{
			throw new BankInvalidInputException("ACCOUNT NUMBER NOT FOUND");
		}
		
	}
	
	public static LocalDate parseAndValidateDate(String accnOpenDate)throws BankInvalidInputException
	{
		LocalDate manuDate=LocalDate.parse(accnOpenDate);
		LocalDate checkDate=LocalDate.of(2002,01,01);
		if(manuDate.isBefore(checkDate))
			{
			throw new BankInvalidInputException("DATE MUST BE BEFORE 1st Jan 2002");
			}
		return manuDate;
	}
	
	public static Account parseAndValidateAccount(String accountType) throws IllegalArgumentException
	{	
		return Account.valueOf(accountType.toUpperCase());		
	}
	
	
	public static Bank ValidateAllDetails(String accountNumber,int uniqueId,String name,long balance,String accType,String accnOpenDate,List<Bank>list) throws BankInvalidInputException,BankInvalidInputException
	{
		CheckAndValidateAccountNumber(accountNumber,list);
		LocalDate date=parseAndValidateDate(accnOpenDate);
		Account accountType=parseAndValidateAccount(accType);
		
		return new Bank(accountNumber,uniqueId,name,balance,accountType,date);
	}

	

}
