package jp;

public class Students {
   

	static final private String INSTITUTE_NAME="Anudip";

   private int rollno;
   private String name;
   private int age;
   
   public Students() {
		super();

	}

   public Students(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
   public String getINSTITUTE_NAME() {
		return INSTITUTE_NAME ;
	}
  

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}



@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}
   

}
