package initialproject.initialAssignment;

import java.lang.management.GarbageCollectorMXBean;

class Base
{
	Base()
	{
		System.out.println("Base Class");
	}
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived class");
	}
}
public class Simpleinheritance {

	public static void main(String args[])
	{
		Derived derived=new Derived();
		
	}
}
