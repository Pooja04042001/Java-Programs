package jp;


public class StudentsMain {

	public static void main(String[] args) {
           Student s=new Student();
		 Student s1=new Student();
		 Student s2=new Student();
		 s.setRollno(23);
		 s.setName("Pooja");
		 s.setAge(20);
		 
		 s1.setRollno(23);
		 s1.setName("pooja");
		 s1.setAge(25);
		
		 s2.setRollno(22);
		 s2.setName("Deeps");
		 s2.setAge(26);
		 // get the values of students
		 System.out.println("Details of student s");
		 System.out.println(s.getINSTITUTE_NAME());
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println("Details of student s1");
			System.out.println(s1.getINSTITUTE_NAME());
			System.out.println(s1.getRollno());
			System.out.println(s1.getName());
			System.out.println(s1.getAge());
			System.out.println("Details of student s2");
			System.out.println(s2.getINSTITUTE_NAME());
			System.out.println(s2.getRollno());
			System.out.println(s2.getName());
			System.out.println(s2.getAge());
		
	}
}