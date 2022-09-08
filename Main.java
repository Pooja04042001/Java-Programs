package jp;
public class Main 
{

	public static void main(String args[])
	{
		Square s1=new Square();
		s1.area();
		System.out.println("area of  square is : "+s1.area());
		
		Rectangle s2=new Rectangle();
		s2.area();
		System.out.println("area of  rectangle is : "+s2.area());
	}
}