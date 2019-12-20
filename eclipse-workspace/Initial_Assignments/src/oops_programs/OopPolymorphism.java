package oops_programs;

// Overloading or Compile time polymorphisam. 
class Overloading
{
	//Constructor overloading
	public Overloading() {
		// TODO Auto-generated constructor stub
		System.out.println("default Constructor");
	}
	
	public Overloading(int a)
	{
		System.out.println("Parameterised Constructor");
		System.out.println("A= "+a);
	}
	public Overloading(int a,int b)
	{
		System.out.println("Second Parameterised Constructor");
		System.out.println("Addition="+(a+b));
	}
	
	//Method Overloading
	public void methodOverload()
	{
		System.out.println("Simple Method");
	}
	public int methodOverload(int a,int b)
	{
		return a*b;
	}
	public void methodOverload(String name)
	{
		System.out.println("Your Name="+name);
	}
}

//Overriding or Runtime polymorphism.
class RuntimePoly
{
	public void mobileName(String name)
	{
		System.out.println("In method Overriding Base class method");
		System.out.println("Your mobile name="+name);
	}
}
class InheritSuper extends RuntimePoly
{
	public void mobileName(String name)
	{
		super.mobileName(name);
		System.out.println("In method Overriding Derived class method");
		System.out.println("Your mobile name="+name);
	}
}
public class OopPolymorphism {

	public static void main(String args[])
	{
		Overloading overload;
		overload=new Overloading();
		overload=new Overloading(10);
		overload=new Overloading(100, 50);
		
		overload.methodOverload();
		overload.methodOverload("Java");
		System.out.println("Multiplication= "+overload.methodOverload(10, 50));
		
		InheritSuper inheritSuper=new InheritSuper();
		inheritSuper.mobileName("iPhone");
	}
}
