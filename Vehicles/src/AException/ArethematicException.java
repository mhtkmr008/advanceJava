package AException;

public class ArethematicException {

	private double num1;
	private double num2;
	
	public ArethematicException(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public String toString()
	{
		return num1+" "+num2;
	}
}
