package AException;

public class ValidateArethematicException {
	
	
	
//	private static void ParseAndValidate(String a, String b) {
//		double num1=Double.parseDouble(a);
//		double num2=Double.parseDouble(a);
//	}
	
	public static void ValidateAllInputs(String[] args) 
	{
		if(args.length!=2) 
		{
			throw new IllegalArgumentException("Please Provide Exactly two Numbers");
		}
//		return true;
//		ParseAndValidate(args[0],args[1]);		
//		
//		return new ArethematicException(double num1,double num2); 
	}



	

}
