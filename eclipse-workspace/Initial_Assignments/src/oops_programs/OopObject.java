package oops_programs;

class ObjectExample
{
	//variable
	int a;
	
	//method
	public void printA()
	{
		System.out.println("A= "+a);
	}
}
public class OopObject {
	
	public static void main(String args[])
	{
		//Object of ObjectExample class
		ObjectExample objectExample=new ObjectExample();
		
		//Initialize value using object
		objectExample.a=100;
		
		//call method using object
		objectExample.printA();
	}
}
