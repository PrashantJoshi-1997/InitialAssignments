package tenusefulqoutes;

public class SecondQuote {

	//never make an instance field of public class.
	
	//Bad
	public String[] alphbets= {"A","B","C"};
	
	//Good
	private String[] smallAlpha= {"a","b","c"};
	
	public String[] getSmallAlpha()
	{
		return smallAlpha;
	}
	
	//Best way to it in Unmodifiable approach using clone
	private String[] capitalAlpha= {"A","B","C"};
	
	public String[] getCapitalAlpha()
	{
		return capitalAlpha.clone();
	}
	
	
}
