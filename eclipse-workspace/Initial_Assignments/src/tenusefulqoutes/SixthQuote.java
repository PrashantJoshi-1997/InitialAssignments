package tenusefulqoutes;

//Try to use standard library instead of writing your own scratch.

public class SixthQuote {

	//Bad
	public void sum()
	{
		int a=10,b=20;
		System.out.println("Sum="+(a+b));
	}
	
	//Good
	public void addition(int x,int y)
	{
		Math.addExact(x, y);
	}
}
