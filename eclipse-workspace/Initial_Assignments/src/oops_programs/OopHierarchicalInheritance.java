package oops_programs;

class School
{
	public void schoolName(String scName)
	{
		System.out.println("School Name="+scName);
	}
}
class Student extends School
{
	public void studentName(String stdName)
	{
		System.out.println("Student Name="+stdName);
	}
}

class Faculty extends School
{
	public void facultyName(String stdName)
	{
		System.out.println("Faculty Name="+stdName);
	}
}

class Department extends School
{
	public void departmentName(String stdName)
	{
		System.out.println("Department Name="+stdName);
	}
}

public class OopHierarchicalInheritance {

	public static void main(String args[])
	{
		Student student=new Student();
		student.schoolName("Java");
		student.studentName("PJ");
		
		Faculty faculty=new Faculty();
		faculty.schoolName("Java");
		faculty.facultyName("Nilesh");
		
		Department department=new Department();
		department.schoolName("Java");
		department.departmentName("Account");
	}
}
