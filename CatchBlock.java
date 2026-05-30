//WAP to demonstrate try catch block.  
package java_assignment;

public class CatchBlock 
{
	public class TryCatchDemo
	{
	    public static void main(String[] args)
	    {
	        try
	        {
	            int num = 10 / 0;   // Exception occurs here
	            System.out.println("Result = " + num);
	        }
	        catch (ArithmeticException e)
	        {
	            System.out.println("Cannot divide by zero.");
	        }

	        System.out.println("Program continues after catch block.");
	    }
	}
}
