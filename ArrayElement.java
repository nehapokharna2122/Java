//WAP to calculate the average value of array elements. 

package java_assignment;

import java.util.Scanner;

public class ArrayElement 
{


	    public static void main(String[] args) 
	    {
	        Scanner AE = new Scanner(System.in);

	        int arr[] = new int[5];
	        int sum = 0;
	        double avg;

	        // Input array elements
	        System.out.println("Enter 5 array elements:");

	        for(int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = AE.nextInt();
	            sum = sum + arr[i];
	        }

	        // Calculate average
	        avg = (double) sum / arr.length;

	        // Display result
	        System.out.println("Average value = " + avg);

	        AE.close();
	    }
	}

