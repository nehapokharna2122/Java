package java_assignment;


	import java.util.Scanner;

	public class GreatestNumber 
	{
	    public static void main(String[] args) 
	    {

	        Scanner sc = new Scanner(System.in);

	        // Taking three numbers from user
	        System.out.print("Enter first number:...");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ...");
	        int b = sc.nextInt();

	        System.out.print("Enter third number: ...");
	        int c = sc.nextInt();

	        // Finding greatest number
	        if (a > b && a > c) 
	        {
	            System.out.println("Greatest number is: " + a);
	        } 
	        else if (b > a && b > c) 
	        {
	            System.out.println("Greatest number is: " + b);
	        } 
	        else 
	        {
	            System.out.println("Greatest number is: " + c);
	        }

	        sc.close();
	    }
	}


