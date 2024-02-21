package constructor_overloading;

public class Student {
	public static void main(String args[]) {
		Student S1=new Student(103);
		Student S2=new Student("Vaishnavi","Pune");
		S1.display();
		S2.display();
	}
		int rollno;
		String name;
		String address;
		
		Student(int i)
		{
			rollno=i;
		}
	Student(String n,String a)
	{
		name=n;
		address=a;
	}
void display() {
	System.out.println(" "+ rollno + " " +name+" "+address);
}

}
