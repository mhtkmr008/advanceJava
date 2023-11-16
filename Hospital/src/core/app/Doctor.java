package core.app;

import java.time.LocalDate;

public class Doctor {

	private String dName, deg, email, pass;
	private int docId, exp;
	private double sal;
	private LocalDate jdate;
	private Department dept;
	private static int count;

	static {
		count = 10100;
	}

	public Doctor(String dName, String deg, String email, String pass, int exp, double sal, LocalDate jdate,
			Department dept) {

		this.docId = ++count;
		this.dName = dName;
		this.deg = deg;
		this.email = email.toLowerCase();
		this.pass = pass;
		this.exp = exp;
		this.sal = sal;
		this.jdate = jdate;
		this.dept = dept;

	}
	
	public Doctor(String email)
	{
		this.email=email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setJdate(LocalDate jdate) {
		this.jdate = jdate;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getdName() {
		return dName;
	}

	public String getDeg() {
		return deg;
	}

	public String getEmail() {
		return email;
	}

	public int getDocId() {
		return docId;
	}

	public int getExp() {
		return exp;
	}

	public double getSal() {
		return sal;
	}

	public LocalDate getJdate() {
		return jdate;
	}

	public Department getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Doctor [ docId=" + docId + ",dName=" + dName + ", deg=" + deg + ", email=" + email + ", exp=" + exp
				+ ", sal=" + sal + ", jdate=" + jdate + ", dept=" + dept + "]";
	}

}
