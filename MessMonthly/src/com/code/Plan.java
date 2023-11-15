package com.code;
/*
 * Monthly (3000), Quarterly (11700), Half Year (17500), Yearly (32000)
 */
public enum Plan {MONTHLY(3000),QUARTERLY(11700),HAFLYEAR(17500),YEARLY(32000);
private double pPrice;

Plan(double pPrice)
{
	pPrice=this.pPrice;
}

public static int getDuration(Plan plan)
{
	if(plan==Plan.MONTHLY)
		return 1;
	if(plan.equals(Plan.QUARTERLY))
		return 3;
	if(plan==Plan.HAFLYEAR)
		return 6;
	if(plan==Plan.YEARLY)
		return 12;
	return 0;
		
}

public double getpPrice() {
	return pPrice;
}

public void setpPrice(double pPrice) {
	this.pPrice = pPrice;
}


}
