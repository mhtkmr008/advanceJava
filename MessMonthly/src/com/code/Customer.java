package com.code;
import com.code.Plan;
import java.time.LocalDate;
import static com.code.Plan.getDuration;

/*
 * Customer id(int) , first name(String), last name (String), 
 * email(String), password(String),Address String, RegisterDate(LocalDate)
 * , planEndDate(LocalDate), Address(String),
Phone No(String),plan Enum, final_amount double
 */
public class Customer implements Comparable<Customer>{

	private int customerId;
	private String Fname,Lname,email,password,Address,phNumber;
	private LocalDate regDate,pEndDate;
	private static int autoCount;
	private double fAmount;
	private Plan plan;
	
	static
	{
		autoCount=1000;
	}
	
	
	
	public Customer(String fname, String lname, String email, String password, String address,
			String phNumber, LocalDate regDate,Plan plan, double fAmount) {
		super();
		this.customerId = autoCount++;
		this.Fname = fname;
		this.Lname = lname;
		this.email = email;
		this.password = password;
		this.Address = address;
		this.phNumber = phNumber;
		this.regDate = regDate;
		this.pEndDate = this.regDate.plusMonths(getDuration(plan));
		this.plan = plan;
		this.fAmount = fAmount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public LocalDate getRdate() {
		return regDate;
	}
	public void setRdate(LocalDate rdate) {
		this.regDate = rdate;
	}
	public LocalDate getpEndDate() {
		return pEndDate;
	}
	public void setpEndDate(LocalDate pEndDate) {
		this.pEndDate = pEndDate;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public double getfAmount() {
		return fAmount;
	}
	public void setfAmount(double fAmount) {
		this.fAmount = fAmount;
	}




	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email
				+ ", password=" + password + ", Address=" + Address + ", phNumber=" + phNumber + ", rdate=" + regDate
				+ ", pEndDate=" + pEndDate + ", plan=" + plan + ", fAmount=" + fAmount + "]";
	}
	@Override
	public int compareTo(Customer anotherCust) {
		return this.email.compareTo(anotherCust.email);
		
	}
	
	
	
}
