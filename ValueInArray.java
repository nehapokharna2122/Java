// WAP to sum values of an array. 

package java_assignment;

import java.util.Scanner;

public class ValueInArray
{
	
	    public static void main(String[] args)
	    {
	        Scanner AR = new Scanner(System.in);

	        int arr[] = new int[5];
	        int sum = 0;

	        System.out.println("Enter 5 array values:");

	        for(int i = 0; i < arr.length; i++)
	        {
	            arr[i] = AR.nextInt();
	        }

	        for(int i = 0; i < arr.length; i++)
	        {
	            sum = sum + arr[i];
	        }

	        System.out.println("Sum of array values = " + sum);
	    }
}

