package jp;
public class Rectangle extends Square implements Shape
{
public int width=9;
	

	public int area()
	{
		int area=length*width;
		return area;
	}
	
	
}