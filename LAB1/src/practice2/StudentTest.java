package practice2;

public class StudentTest 
{
	public static void main(String args[])
	{
		Student s = new Student();
		
		for(Student cur: Student.studentsList) 
			System.out.println(cur);
		
		System.out.println(s.getId());
	}
}