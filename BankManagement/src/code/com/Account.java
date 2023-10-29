package code.com;

public enum Account {CURRENT(1000),SAVING(2000),FIXED(3000);

	private double money;
	
	private Account(double money) 
	{
		this.money=money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	
}
