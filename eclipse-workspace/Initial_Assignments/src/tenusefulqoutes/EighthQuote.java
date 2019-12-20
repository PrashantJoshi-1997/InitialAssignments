package tenusefulqoutes;

//Use String with utmost care.
//Avoid constructor of String class.
public class EighthQuote {

	public void stringData()
	{
		//slow initialization
		String name=new String("Logilite");
		
		//Fast initialization
		String companyName="Logilite";
		
		System.out.println(name);
		System.out.println(companyName);
	}
}
