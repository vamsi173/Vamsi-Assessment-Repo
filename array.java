import java.util.Scanner;
public class array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][][] = new int[2][2][5];
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                for(int k=0;k<=arr.length-1;k++)
                {
                    System.out.println("enter the value of arr["+i+"]["+j+"]["+k+"]");
                
                    arr[i][j][k] = sc.nextInt();

                }
            }
            System.out.println();
            System.out.print(" The ages are :");
            for(int i=0;i<=arr.length-1;i++)
            {
                for(int j=0;j<=arr.length-1;j++)
                {
                    for(int k=0;k<=arr.length-1;k++)
                    {
                        System.out.println("The ages of students arr["+i+"]["+j+"]["+k+"] = "+arr[i][j][k]);
                    }
                }
        }
    }
}
};

