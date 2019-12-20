package oops_programs;

//This the class In OOPs
class Class
{
	//Initializer block.
	{
		System.out.println("Initializer block");
	}
	//Constructor
	Class()
	{
		System.out.println("In Constructor");
	}
	//Method
	public void name()
	{
		System.out.println("In Name Method");
	}
	
}
public class OopClass {
	//Main Method
	public static void main(String args[])
	{
		Class cls=new Class();
		cls.name();
	}
}
