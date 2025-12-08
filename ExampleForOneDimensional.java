import java.util.Scanner;

public class ExampleForOneDimensional {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = 5;
		int arr[] = new int[n];
		
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the age of student " + i);
			arr[i] = s.nextInt();
		}
		
		System.out.println(" ------------------------------------------------- ");
		
		System.out.println("The ages are : ");
		
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.println("The age of student " + i + " is " +arr[i]);

		}
		

	}

}
