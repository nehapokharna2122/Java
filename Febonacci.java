// W.A.J.P to create Fibonacci Series

package java_assignment;
	
	import java.util.Scanner;

    public class Febonacci 

	{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        int n, a = 0, b = 1, c;

	        System.out.print("Enter number of terms: ");
	        n = sc.nextInt();

	        System.out.println("Fibonacci Series:");

	        for(int i = 1; i <= n; i++)
	        {
	            System.out.print(a + " ");

	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	}

