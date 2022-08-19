package jp;
import java.util.Scanner;
public class Vowels {

	int countVowels(String str) {

		int c=0; 

		str=str.toUpperCase();

		char newCharArray[] = str.toCharArray();

		for(int i=0;i<newCharArray.length;i++)
		{

			if( (newCharArray[i]=='A') || (newCharArray[i]=='E') || (newCharArray[i]=='I') || (newCharArray[i]=='O') ||  (newCharArray[i]=='U')   )
				c++;
 
			if(newCharArray[i]=='X') {
				try {
					throw new Exception();
				}
				catch(Exception e) {
					System.out.println("letter x contains Exception");
				}
			}
		}

		return c;
	}

	public static void main(String[] args) {
 
		Vowels cv = new Vowels();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sring : ");
		String str=s.next();


		int result = cv.countVowels(str);
		System.out.println("Total Number of Vowels presents : "+result);

		s.close();
	}
}