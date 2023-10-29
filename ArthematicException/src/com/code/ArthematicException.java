package com.code;

public class ArthematicException {
public static void main(String args[]) 
{

	 try {
         if (args.length != 2) 
         {
             throw new IllegalArgumentException("Please provide exactly two numbers.");
         }

         double num1 = Double.parseDouble(args[0]);
         double num2 = Double.parseDouble(args[1]);

         if (num2 == 0) 
         {
             throw new ArithmeticException("Cannot divide by zero.");
         }

         double result = num1 / num2;
         System.out.println("Result of division: " + result);
     } catch (IllegalArgumentException e) {
         System.err.println("IllegalArgumentException: " + e.getMessage());
     } catch (ArithmeticException e) {
         System.err.println("ArithmeticException: " + e.getMessage());
     } catch (NumberFormatException e) {
         System.err.println("NumberFormatException: Please enter valid numeric arguments.");
     }
 }

}

