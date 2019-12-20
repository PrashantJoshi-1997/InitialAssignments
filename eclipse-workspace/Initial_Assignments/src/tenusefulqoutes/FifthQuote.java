package tenusefulqoutes;

//Declare variable when it needed.
public class FifthQuote {

	//Bad 
	
	int ans;
	public void addition()
	{
		int a=10,b=20;
		ans=a+b;
		System.out.println("Addition is: "+ans);
	}
	
	//Good
	public void sum()
	{
		int a=10,b=20;
		int ans=a+b;
		System.out.println("Addition is: "+ans);
	}
}
