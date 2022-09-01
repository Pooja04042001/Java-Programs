import java.util.Scanner;
public class CountChar{
static void t(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter any String:");
    String n = sc.nextLine();
    System.out.println("Calculates the number of characters this string: " +n);
    int c =0;
    for (int i=0 ; i<string.Length;i++)
    {
       if (string.charAt(i)!=' ')
    c++;
    }
    System.out.println("Total no. of Character : " +c);
    
}
public static void main(String args[]){

t();
    }
}
