package java_assignment;


	import java.util.Scanner;

	public class ArrayIndex 
	{
	    public static void main(String[] args) 
	    {
	        int arr[] = {10, 20, 30, 40, 50};

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter element to find: ");
	        int num = sc.nextInt();

	        int index = -1;

	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] == num) 
	            {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) 
	        {
	            System.out.println("Element found at index: " + index);
	        } else 
	        {
	            System.out.println("Element not found in array");
	        }

	        sc.close();
	    }
}

