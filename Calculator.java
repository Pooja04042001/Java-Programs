package jp;
public class Calculator {
     public int add(int x, int y) { return (x + y); }
     
     public double add(double x, int y, int z)
     {
         return (x + y + z);
     }
     public String add(String x,String y) {
    	 return (x+y);
     }
 public int sub(int x,int y) {
    	 return (x-y);}
     
    	 public double sub(double x,double y)  {
    		 return (x-y);
    	 }
     

     public static void main(String args[])
     {
         Calculator a = new Calculator();
         System.out.println(a.add(11, 14));
         System.out.println(a.add(5.0, 22, 88));
         System.out.println(a.add("Pooja", "Soni"));
         System.out.println("Done");
         System.out.println(a.sub(9,9));
         System.out.println(a.sub(6.0, 17.0));
         System.out.println("Done");
 }
}
