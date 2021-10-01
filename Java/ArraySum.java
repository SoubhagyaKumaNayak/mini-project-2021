import java.util.Scanner;

class ArraySum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N, sum=0;
		

		System.out.print("No.of elements in an array: ");
		N = sc.nextInt();

		
                int[] arr = new int[N];
		for(int i=0; i<N; i++)
		{
			System.out.print("array- "+(i+1)+":");
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<N; i++)
		{
			 sum+= arr[i];
		}
		System.out.println("sum of array: " + sum);
	}
}
