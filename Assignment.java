package java_assignment;


import java.util.Scanner;
    public class ArmstrongNo 
{
	
    public static void main(String[] args) 
	    {
	        Scanner AS = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = AS.nextInt();

	        int originalNum = num;
	        int remainder, result = 0;

	        while (num != 0) 
	        {
	            remainder = num % 10;
	            result = result + (remainder * remainder * remainder);
	            num = num / 10;
	        }

	        if (originalNum == result) 
	        {
	            System.out.println(originalNum + " is an Armstrong Number");
	        } 
	        else 
	        {
	            System.out.println(originalNum + " is not an Armstrong Number");
	        }
	    }
}

