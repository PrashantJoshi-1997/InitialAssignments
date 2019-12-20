package tenusefulqoutes;

//Always try to minimize the mutability of class

public class ThirdQuote {

	private String firstName,lastName;
	
	private ThirdQuote(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public static ThirdQuote valueOf(String firstName,String lastName)
	{
		return new ThirdQuote(firstName,lastName);
	}
}
