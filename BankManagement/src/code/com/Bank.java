package code.com;
import java.time.LocalDate;



public class Bank {

 private String accountNumber;
 private int uniqueId;
 private String name;
 private long balance;
 private Account accType; 
 private LocalDate accnOpenDate;


public Bank(String accountNumber,int uniqueId,String name,long Balance,Account accType,LocalDate accnOpenDate)
{
	this.accountNumber=accountNumber;
	this.uniqueId=uniqueId;
	this.name=name;
	this.balance=balance;
	this.accType=accType;
	this.accnOpenDate=accnOpenDate;
}

public Bank(String accountNumber)
{
	this.accountNumber=accountNumber;
}


public String getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}


public int getUniqueId() {
	return uniqueId;
}


public void setUniqueId(int uniqueId) {
	this.uniqueId = uniqueId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public long getBalance() {
	return balance;
}


public void setBalance(long balance) {
	this.balance = balance;
}


public Account getAccType() {
	return accType;
}


public void setAccType(Account accType) {
	this.accType = accType;
}


public LocalDate getAccnOpenDate() {
	return accnOpenDate;
}


public void setAccnOpenDate(LocalDate accnOpenDate) {
	this.accnOpenDate = accnOpenDate;
}


@Override
public String toString() {
	return "Bank [accountNumber=" + accountNumber + ", uniqueId=" + uniqueId + ", name=" + name + ", balance=" + balance
			+ ", accType=" + accType + ", accnOpenDate=" + accnOpenDate + "]";
}


}