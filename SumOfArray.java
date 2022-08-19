package jp;
import java.util.Scanner;
class SumOfArray {
	int sum(int[] values, int start,int end)
	{
		int sum = 0; 
		try 
		{
			for(int a = start;a<end;a++) 
			{
				sum += values[a]; 
			}
			
			if(start==end) 
				throw new IllegalArgumentException();
			
			if(values==null)
				throw new NullPointerException();
			
			if(start<0 || end>=values.length || start>end)
				throw new ArrayIndexOutOfBoundsException();
			
			if(sum==0) 
				throw new Exception();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NullPointerException a)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e) 
		{
			System.out.println("sum is 0");
		}
	return sum;
	}

	public static void main(String[] args) {
 
		SumOfArray sa = new SumOfArray();

		Scanner sc = new Scanner(System.in);
		int start,end,size;

		System.out.println("Enter Size of array : ");
		size = sc.nextInt();
		int arr[] =new int[size];

		for(int i=0;i<size;i++)
		{
			System.out.println("enter value of ["+i+"] index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Start index of array : ");
		start = sc.nextInt();
		
		System.out.println("Enter End index of array : ");
		end = sc.nextInt();


		System.out.println("Sum of array elements is : "+sa.sum(arr, start, end));
		sc.close();
	}
}