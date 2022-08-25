package jp;

public class prog2 {

	static String strConcat(String st[])
	{
		StringBuilder builder = new StringBuilder();;
		try {
			if(st==null) {
				throw new Exception();
			}


			for(String s : st) {

				builder.append(s+" ");
			}
		}catch(Exception e)
		{

			System.out.print("Array Can't Null");
		}

		return builder.toString();
	}
	public static void main(String[] args) {
		String st1[]= null;
		String st2[]= {"I","am","a"};
		String st3[]= {"good","girl"};

		System.out.println(strConcat(st1));
		System.out.println(strConcat(st2));
		System.out.println(strConcat(st3));

	}
}
