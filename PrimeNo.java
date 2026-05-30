package java_assignment;


import java.util.Scanner;

	public class PrimeNo
{
	    public static void main(String[] args)
	    {
	        int n, i, count = 0;

	        Scanner PN = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        n = PN.nextInt();

	        for(i = 1; i <= n; i++)
	        {
	            if(n % i == 0)
	            {
	                count++;
	            }
	        }

	        if(count == 2)
	        {
	            System.out.println("Prime Number");
	        }
	        else
	        {
	            System.out.println("Not a Prime Number");
	        }
	    }
}



