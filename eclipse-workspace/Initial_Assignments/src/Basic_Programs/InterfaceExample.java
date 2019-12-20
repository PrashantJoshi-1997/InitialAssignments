package Basic_Programs;

//Interface Example
interface TestingInterface
{
	final int a=10;
	void printData();
}

public class InterfaceExample implements TestingInterface
{
	public void printData()
	{
		System.out.println("Interface Example");
	}
	public static void main(String args[])
	{
		InterfaceExample interfaceExample=new InterfaceExample();
		interfaceExample.printData();
		System.out.println(a);
	}
}
