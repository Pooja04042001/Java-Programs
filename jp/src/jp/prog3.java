package jp;

public class prog3 {
	static void joinArr(String s[],int arr[])
	{
		System.out.println("Names\tValues\n");
		for(int i=0;i<s.length;i++)
		{
				System.out.println(s[i]+"\t"+arr[i]);
		}
	}

	public static void main(String[] args) {

		String str[] = {"Peter","Amy","John","Boyd","Cathy"};
		

		int a[] = {15,9,14,10,12};
		

		joinArr(str,a);
		}
}