package oops_programs;

//Single level inheritance.
class Base
{
	public void baseMethod()
	{
		System.out.println("Base Class");
	}
}
class Derived extends Base
{
	public void derivedMethod()
	{
		System.out.println("Derived Class");
	}
}
public class OopSingleIneritance {
	public static void main(String args[])
	{
		Derived derived=new Derived();
		//Access Base class properties
		derived.baseMethod();
		//Access derived class properties also
		derived.derivedMethod();
	}
}
