package Basic_Programs;

//with abstract method
abstract class AbstractCls
{
	int a=10;
	abstract void simplePrint();
}
class AbstractExample extends AbstractCls
{
	public void simplePrint()
	{
		System.out.println("Abstarct Class Example");
	}
}

//with constructor
abstract class Constructor
{
	Constructor()
	{
		System.out.println("Base Class Constructor");
	}
	abstract void learning();
}
class ConstructorExample extends Constructor
{
	ConstructorExample()
	{
		System.out.println("Derived Class Constructor");
	}
	public void learning()
	{
		System.out.println("Learning Method In derived class");
	}
}

//Without Abstract Method
abstract class WithoutAbsMethod
{
		public void notAbstract()
		{
			System.out.println("Non Abstract using Abstract Keyword");
		}
}
class TestingNonAbs extends WithoutAbsMethod
{
}

//With Final Method
abstract class FinalMethod
{
	final void printFinalMethod()
	{
		System.out.println("Final Method in Abstract class");
	}
}
class WithFinal extends FinalMethod
{

}

//Main Class
public class AbstractClass
{
	public static void main(String args[])
	{
		//By creating reference of Abstract Class
		AbstractCls abstractCls=new AbstractExample();
		abstractCls.simplePrint();
		
		//Calling Constructor in Abstract class
		ConstructorExample constructorExample=new ConstructorExample();
		constructorExample.learning();
		
		//Calling Non Abstract method
		TestingNonAbs testingNonAbs=new TestingNonAbs();
		testingNonAbs.notAbstract();
		
		//Calling Final Method of Abstract class
		{
				WithFinal withFinal=new WithFinal();
				withFinal.printFinalMethod();
				system.out.println("Check for TortoiseHg");
		}
	}
}
