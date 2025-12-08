import java.util.Scanner;

public class ExampleForJaggedArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of batches");
		int n = s.nextInt();
		
		System.out.println("Enter the number of students for batch 1");
		int firstbatch = s.nextInt();
		
		System.out.println("Enter the number of students for batch 2");
		int secondbatch = s.nextInt();
		
		int arr[][] = new int[n][];
		arr[0] = new int[firstbatch];
		arr[1] = new int[secondbatch];
		
		for(int i=0;i<=arr.length-1;i++)//Batches
		{
			for(int j=0;j<=arr[i].length-1;j++)//student
			{
				System.out.println("Enter the age of student " + j + " from batch " + i);
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("-------------------------------------------");
		
		System.out.println("The ages are : ");
		
		for(int i=0;i<=arr.length-1;i++)//Batches
		{
			for(int j=0;j<=arr[i].length-1;j++)//student
			{
				System.out.println("The age of student " + j + " from batch " + i + " is " + arr[i][j]);
				
			}
		}
	}

}