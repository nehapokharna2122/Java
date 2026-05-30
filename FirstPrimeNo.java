// WAP to compute the sum of the first 100 prime numbers. 

package java_assignment;

public class FirstPrimeNo 
{
	public class SumOfPrimeNumbers 
	{
	    public static void main(String[] args) 
	    {
	        int count = 0;
	        int num = 2;
	        int sum = 0;

	        while (count < 100) 
	        {
	            boolean isPrime = true;

	            for (int i = 2; i <= num / 2; i++) 
	            {
	                if (num % i == 0) 
	                {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) 
	            {
	                sum = sum + num;
	                count++;
	            }

	            num++;
	        }

	        System.out.println("Sum of first 100 prime numbers = " + sum);
	    }
	}
}
