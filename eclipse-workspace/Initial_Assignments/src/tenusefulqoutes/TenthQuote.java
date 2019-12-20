package tenusefulqoutes;

import java.util.Date;

//Defensive copies are savior

//Good
class Student
{
	private Date birthDate;
	
	public Student(Date birthDate) {
		this.birthDate=birthDate;
	}
	
	public Date getBirthDate()
	{
		return this.birthDate;
	}
}

//Best
class StudentData
{
	private Date birthDate;
	
	public StudentData() {
		this.birthDate=new Date();
	}
	
	public Date getBirthDate()
	{
		return this.birthDate;
	}
}

public class TenthQuote {
 public static void main(String args[])
 {
	 Date birthDate=new Date();
	 Student student=new Student(birthDate);
	 StudentData studentData=new StudentData();
	 //birthDate.setYear(2017);
	 System.out.println(student.getBirthDate());
	 System.out.println("Best way "+studentData.getBirthDate());
	 
 }
}
