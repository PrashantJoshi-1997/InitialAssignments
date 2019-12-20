package tenusefulqoutes;


//Wherever possible try to use Primitive types instead of Wrapper classes.

public class SeventhQuote {

	public void primitiveTypes()
	{
		int x=10;
		int y=10;
		
		//try to avoid wrapper classes.
		Integer a=new Integer(10);
		Integer b=new Integer(20);
		
		//Simple print
		System.out.println("x="+x+"y"+y);
		System.out.println("A="+a+"B"+b);
	}
}
